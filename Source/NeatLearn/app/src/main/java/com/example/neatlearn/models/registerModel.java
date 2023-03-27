package com.example.neatlearn.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class registerModel {
    @Expose
    @SerializedName("id")
    int id;

    @Expose
    @SerializedName("name")
    String name;

    @Expose
    @SerializedName("gender")
    String gender;

    @Expose
    @SerializedName("email")
    String email;

    @Expose
    @SerializedName("password")
    String password;

    @Expose
    @SerializedName("m_number")
    String m_number;

    @Expose
    @SerializedName("image")
    String image;


    public registerModel(String name, String gender, String email, String m_number, String password, String image) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.m_number = m_number;
        this.password = password;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getM_number() {
        return m_number;
    }

    public void setM_number(String m_number) {
        this.m_number = m_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
