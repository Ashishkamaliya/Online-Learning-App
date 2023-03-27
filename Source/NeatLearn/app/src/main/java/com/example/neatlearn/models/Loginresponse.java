package com.example.neatlearn.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Loginresponse {

    @SerializedName("id")
    @Expose()
    public String user_id;

    @SerializedName("name")
    @Expose()
    public String name;

    @SerializedName("gender")
    @Expose()
    public String gender;

    @SerializedName("email")
    @Expose()
    public String email;

    @SerializedName("m_number")
    @Expose()
    public String m_number;

    @SerializedName("password")
    @Expose()
    public String password;

    @SerializedName("image")
    @Expose()
    public String image;

    public String getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getM_number() {
        return m_number;
    }

    public String getPassword() {
        return password;
    }

    public String getImage() {
        return image;
    }
}
