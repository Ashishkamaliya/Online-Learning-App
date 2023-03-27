package com.example.neatlearn;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.neatlearn.models.registerModel;
import com.example.neatlearn.utilityFiles.apiSet;
import com.example.neatlearn.utilityFiles.controller;
import com.example.neatlearn.utilityFiles.registerApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class studentRegitration extends AppCompatActivity {

    private boolean passwordShowing = false,conpasswordShowing = false;
    EditText name,email,mobile,password,conpassword,Image;
    TextView signin;
    ImageView passwordIcon,conpasswordIcon;
    AppCompatButton signUp;

    apiSet apiset;
    String value="male";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_regitration);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        name = findViewById(R.id.editFullName);
        email=findViewById(R.id.editEmail);
        mobile = findViewById(R.id.editMobile);

        password = findViewById(R.id.editPassword);
        conpassword = findViewById(R.id.editCnPassword);
        passwordIcon = findViewById(R.id.passwordIcon);
        conpasswordIcon = findViewById(R.id.conpasswordIcon);
        Image = findViewById(R.id.editImage);
        signUp = findViewById(R.id.buttonSignUp);
        signin = findViewById(R.id.btnsignin);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        /*value = ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                .getText().toString();*/

        passwordIcon.setOnClickListener(view -> {
            //checking if password is showing or not?
            if(passwordShowing){
                passwordShowing=false;

                password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                passwordIcon.setImageResource(R.drawable.password_show);
            }
            else{
                passwordShowing=true;

                password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                passwordIcon.setImageResource(R.drawable.password_hide);
            }
            //move cursor at last of the text
            password.setSelection(password.length());
        });

        conpasswordIcon.setOnClickListener(view -> {
            //checking if password is showing or not?
            if(conpasswordShowing){
                conpasswordShowing=false;

                conpassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                passwordIcon.setImageResource(R.drawable.password_show);
            }
            else{
                conpasswordShowing=true;

                conpassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                passwordIcon.setImageResource(R.drawable.password_hide);
            }
            //move cursor at last of the text
            conpassword.setSelection(conpassword.length());
        });

//        int m_number;
//        m_number = parseInt(number);
        signUp.setOnClickListener(view -> {

            apiset = registerApiClient.getapiclient().create(apiSet.class);

            Call<Void> call  = apiset.productadd(name.getText().toString(),"MALE",email.getText().toString(),mobile.getText().toString(),password.getText().toString(),Image.getText().toString());
            call.enqueue(new Callback<Void>() {
                @Override
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Toast.makeText(getApplicationContext(), "Registration Successfull..", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),studentLogin.class);
                    startActivity(i);
                    finish();
                }

                @Override
                public void onFailure(Call<Void> call, Throwable t) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            });
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(getApplicationContext(),studentLogin.class);
                startActivity(i2);
                finish();
            }
        });
    }
}