package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_start);
        Button button = (Button) findViewById (R.id.button);
        button.setOnClickListener (new View.OnClickListener () {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent (view.getContext (), MainActivity.class);
                startActivity (intent);
            }
        });
    }
}

