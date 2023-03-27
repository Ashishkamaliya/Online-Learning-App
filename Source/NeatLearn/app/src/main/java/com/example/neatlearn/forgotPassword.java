package com.example.neatlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class forgotPassword extends AppCompatActivity {

    private boolean passwordShowing = false;
    Button btnreset;
    EditText email,otp,password;
    ImageView passIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        btnreset = findViewById(R.id.buttonReset);
        password = findViewById(R.id.editPassword);
        email = findViewById(R.id.email);
        otp = findViewById(R.id.editCode);

        passIcon= findViewById(R.id.passwordIcon);

        passIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passwordShowing){
                    passwordShowing=false;

                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    passIcon.setImageResource(R.drawable.password_show);
                }
                else{
                    passwordShowing=true;

                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    passIcon.setImageResource(R.drawable.password_hide);
                }
                //move cursor at last of the text
                password.setSelection(password.length());
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"This is currently unavailable in Service..",Toast.LENGTH_LONG).show();
            }
        });
    }
}