package com.example.neatlearn.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class loginResponseModel
{
    String message;

    public loginResponseModel(String message) {
        this.message = message;
    }

    public loginResponseModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
