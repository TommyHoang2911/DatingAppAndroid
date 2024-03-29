package com.example.dating_app_android_project.Login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dating_app_android_project.R;
import com.example.dating_app_android_project.Utils.User;

public class RegisterGenderPrefection extends AppCompatActivity {

    String password;
    User user;

    private Button preferenceContinueButton;
    private Button maleSelectionButton;
    private Button femaleSelectionButton;
    boolean preferMale = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_gender_prefection);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("classUser");
        password = intent.getStringExtra("password");


        maleSelectionButton = (Button) findViewById(R.id.maleSelectionButton);
        femaleSelectionButton = (Button) findViewById(R.id.femaleSelectionButton);
        preferenceContinueButton = (Button) findViewById(R.id.preferenceContinueButton);

        //By default male has to be selected so below code is added

        femaleSelectionButton.setAlpha(.5f);
        femaleSelectionButton.setBackgroundColor(Color.GRAY);


        maleSelectionButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                maleButtonSelected();
            }
        });

        femaleSelectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                femaleButtonSelected();
            }
        });

        preferenceContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openAgeEntryPage();
            }
        });

    }

    public void maleButtonSelected() {
        preferMale = true;
        maleSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
        maleSelectionButton.setAlpha(1.0f);
        femaleSelectionButton.setAlpha(.5f);
        femaleSelectionButton.setBackgroundColor(Color.GRAY);
    }

    public void femaleButtonSelected()
    {
        preferMale = false;
        femaleSelectionButton.setBackgroundColor(Color.parseColor("#FF4081"));
        femaleSelectionButton.setAlpha(1.0f);
        maleSelectionButton.setAlpha(.5f);
        maleSelectionButton.setBackgroundColor(Color.GRAY);
    }

    public void openAgeEntryPage()
    {
        String preferSex = preferMale ? "male" : "female";
        user.setPreferSex(preferSex);
        Intent intent = new Intent(this, RegisterAge.class);
        intent.putExtra("password", password);
        intent.putExtra("classUser", user);
        startActivity(intent);
    }
}
