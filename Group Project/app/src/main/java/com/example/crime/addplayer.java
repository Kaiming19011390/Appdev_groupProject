package com.example.crime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addplayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addplayer);

        final EditText PlayerOne = findViewById(R.id.PlayerOneName);
        final EditText PlayerTwo = findViewById(R.id.PlayerTwoName);
        final Button StartBtn = findViewById(R.id.StartBtn);

        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String getPlayerOneName = PlayerOne.getText().toString();
                final String getPlayerTwoName = PlayerTwo.getText().toString();

                if(getPlayerOneName)

            }
        });

    }

}