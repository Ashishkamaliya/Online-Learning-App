package com.example.neatlearn.utilityFiles;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class controller {
    private static final String url = "https://neatlearn.000webhostapp.com/";
    private static controller clientobject;
    private static Retrofit retrofit;

    controller(){
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized controller getInstance(){
        if(clientobject==null){
            clientobject=new controller();
        }
        return clientobject;
    }

    public apiSet getapi(){
        return  retrofit.create(apiSet.class);
    }
}
