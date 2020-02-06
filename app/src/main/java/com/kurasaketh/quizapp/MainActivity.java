package com.kurasaketh.quizapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button color;
    EditText bodypartText;
    EditText nounText;
    EditText vegetableText;
    TextView madlibstext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.clickButton);
        bodypartText = findViewById(R.id.bodypartEditText);
        nounText = findViewById(R.id.nounEditText);
        vegetableText = findViewById(R.id.vegetableEditText);
        madlibstext = findViewById(R.id.madlib);
        color = findViewById(R.id.colorButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nounText.getText().toString().equals("") || vegetableText.getText().toString().equals("") || bodypartText.getText().toString().equals("")){
                    madlibstext.setText("Please fill out all of the boxes.");
                }

                else {
                System.out.println("Hello mom");
                Log.i("testButton", "hi dad!");
                Log.i("testButton", "submitted madlib: ");
                madlibstext.setText("Here are some things to do at recess. 1) Start a game of " + bodypartText.getText().toString() +
                                "-ball. 2) Put a " + nounText.getText().toString() + " in someone's lunch bag. 3) Start a " +
                        vegetableText.getText().toString() + " fight in the lunch room.");
            }
        }});
    }
    public void colorchanger(View v){
        Log.i("testButton", "color button pressed!");
        submitButton.setBackgroundColor(Color.rgb(20, 90, 60));
        color.setBackgroundColor(Color.rgb(20, 90, 60));
        madlibstext.setTextColor(Color.rgb(10, 50, 90));
    }
}
