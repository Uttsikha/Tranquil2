package com.example.tranquil.Network;


import com.example.tranquil.model.FeedResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetDataService {
    // @GET("/photos")
    //Call<List<Retro>> getAllPhotos();

    @GET("feeds.json")
    Call<FeedResponse> getAllFeed(@Query("api_key") String apiKey);
}
