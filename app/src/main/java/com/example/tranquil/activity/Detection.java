package com.example.tranquil.activity;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.Toast;

import com.example.tranquil.Network.GetDataService;
import com.example.tranquil.Network.RetroftiClientInstance;
import com.example.tranquil.R;
import com.example.tranquil.adapter.CustomAdapter;
import com.example.tranquil.model.FeedResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class Detection extends AppCompatActivity {

    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);
        b=new Button(Detection.this);
        b.setText("Start");
        progressDialog = new ProgressDialog(Detection.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetroftiClientInstance.getRetrofitInstance().create(GetDataService.class);
        // Call<List<Retro>> call = service.getAllPhotos();
        Call<FeedResponse> call1 = service.getAllFeed("QK02PRLOV9I5K96J");
        call1.enqueue(new Callback<FeedResponse>() {


            @Override
            public void onResponse(Call<FeedResponse> call, Response<FeedResponse> response) {
                progressDialog.dismiss();
                generateDataList(response.body().getFeeds());


            }
            @Override
            public void onFailure(Call<FeedResponse> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(Detection.this, "Something went wrong...Please try later!... Are you connected to the Internet?", Toast.LENGTH_SHORT).show();
            }

        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateDataList(List<FeedResponse.Feed> photoList) {
        recyclerView = findViewById(R.id.customRecyclerView);
        adapter = new CustomAdapter(this,photoList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Detection.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                // Call smooth scroll
                recyclerView.smoothScrollToPosition(adapter.getItemCount() - 1);
            }
        });
    }

}