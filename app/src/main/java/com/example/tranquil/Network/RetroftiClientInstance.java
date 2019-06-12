package com.example.tranquil.Network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroftiClientInstance {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.thingspeak.com/channels/791083/";
    /*
     *
     * https://api.thingspeak.com/channels/791083/feeds.json?api_key=QK02PRLOV9I5K96J
     * https://api.thingspeak.com/channels/791083/feeds.json?api_key=QK02PRLOV9I5K96J&results=2
     * https://api.thingspeak.com/channels/791083/fields/1.json?api_key=QK02PRLOV9I5K96J&results=2
     * https://api.thingspeak.com/channels/791083/status.json?api_key=QK02PRLOV9I5K96J
     *
     * */
    public static Retrofit getRetrofitInstance() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;

    }
}
