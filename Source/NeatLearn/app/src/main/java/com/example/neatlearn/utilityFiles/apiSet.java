package com.example.neatlearn.utilityFiles;

import com.example.neatlearn.models.loginResponseModel;
import com.example.neatlearn.models.registerModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface apiSet {

    @FormUrlEncoded
    @POST("login.php")
    Call<loginResponseModel> verifyUser(
            @Field("email") String email,
            @Field("password") String pasword);

    @FormUrlEncoded
    @POST("register.php")
    Call<Void>productadd(
            @Field("name") String name,
            @Field("gender") String gender,
            @Field("email") String email,
            @Field("m_number") String m_number,
            @Field("password") String password,
            @Field("image") String image);

//    @GET("view.php")
//    Call<List<Model>> productview();
}
