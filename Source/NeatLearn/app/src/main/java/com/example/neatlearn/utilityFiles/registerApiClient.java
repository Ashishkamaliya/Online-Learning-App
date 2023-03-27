package com.example.neatlearn.utilityFiles;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class registerApiClient {
    static Retrofit retrofit = null;

    public static final String BASE_URL = "https://neatlearn.000webhostapp.com/";


    public static Retrofit getapiclient()
    {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
