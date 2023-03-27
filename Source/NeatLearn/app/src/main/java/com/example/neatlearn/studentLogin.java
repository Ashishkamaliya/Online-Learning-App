package com.example.neatlearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.neatlearn.utilityFiles.controller;

import com.example.neatlearn.models.loginResponseModel;
import com.example.neatlearn.neatLearn.home;

import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class studentLogin extends AppCompatActivity {

    private boolean passwordShowing = false;
    EditText usn,pass;
    TextView forgotpass,signup,alert;
    ImageView passwordIcon;
    AppCompatButton signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        if (isConnected()) {

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        usn = findViewById(R.id.editUsername);
        pass = findViewById(R.id.editPassword);
        passwordIcon = findViewById(R.id.passwordIcon);
        signin = findViewById(R.id.buttonSignIn);

        forgotpass = findViewById(R.id.btnForgotPassword);
        signup = findViewById(R.id.btnsignup);
        alert = findViewById(R.id.txtAlert);

        checkUserExistance();

        passwordIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checking if password is showing or not?
                if(passwordShowing){
                    passwordShowing=false;

                    pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passwordIcon.setImageResource(R.drawable.password_show);
                }
                else{
                    passwordShowing=true;

                    pass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    passwordIcon.setImageResource(R.drawable.password_hide);
                }
                //move cursor at last of the text
                pass.setSelection(pass.length());
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                processLogin();

//                Intent i2=new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i2);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(),studentRegitration.class);
                startActivity(i3);
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),forgotPassword.class));
                finish();
            }
        });
        } else {
            Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
        }
    }

    void processLogin(){

        String email = usn.getText().toString();
        String password = pass.getText().toString();

        Call<loginResponseModel> call = controller
                .getInstance()
                .getapi()
                .verifyUser(email,password);

        call.enqueue(new Callback<loginResponseModel>() {
            @Override
            public void onResponse(Call<loginResponseModel> call, Response<loginResponseModel> response) {
                loginResponseModel obj = response.body();
                String output= obj.getMessage();
                if(output.equals("failed")){
                    alert.setText("Invalid Credentials..");
                    alert.setTextColor(Color.RED);
                }
                if(output.equals("exist")) {

                    saveInfo();
                    Intent intent = new Intent(studentLogin.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }

            @Override
            public void onFailure(Call<loginResponseModel> call, Throwable t) {
                alert.setText("Somthig went wrong");
            }

            private void saveInfo() {
                SharedPreferences sp = getSharedPreferences("credentials", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("USERNAME",usn.getText().toString());
                editor.putString("PASSWORD", pass.getText().toString());
                editor.commit();
                editor.apply();
            }
        });
    }
    void checkUserExistance(){
        SharedPreferences sp = getSharedPreferences("credentials", MODE_PRIVATE);
        if(sp.contains("USERNAME")){
            startActivity(new Intent(getApplicationContext(),MainActivity.class));
        }
        /*else{
            alert.setText("Please login..");
            alert.setTextColor(Color.RED);
        }*/
    }

    public boolean isConnected() {
        boolean connected = false;
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo nInfo = cm.getActiveNetworkInfo();
            connected = nInfo != null && nInfo.isAvailable() && nInfo.isConnected();
            return connected;
        } catch (Exception e) {
            Log.e("Connectivity Exception", e.getMessage());
        }
        return connected;
    }
}