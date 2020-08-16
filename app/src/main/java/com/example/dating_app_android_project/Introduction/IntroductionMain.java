package com.example.dating_app_android_project.Introduction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dating_app_android_project.Login.Login;
import com.example.dating_app_android_project.Login.RegisterBasicInfo;
import com.example.dating_app_android_project.R;

//import android.support.v7.app.AppCompatActivity;

public class IntroductionMain extends AppCompatActivity {

    private Button signupButton;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_main);

        signupButton = (Button) findViewById(R.id.signup_button);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openEmailAddressEntryPage();
            }
        });

        loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
    }

    public void openLoginPage(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void openEmailAddressEntryPage() {
        Intent intent = new Intent(this, RegisterBasicInfo.class);
        startActivity(intent);
    }
}
