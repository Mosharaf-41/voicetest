package com.example.voicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDysplay;
    FloatingActionButton fabButton;
    TextToSpeech textToSpeech;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDysplay = findViewById(R.id.tvDysplay);
        fabButton = findViewById(R.id.fabButton);




        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status == TextToSpeech.SUCCESS){
                    String text= tvDysplay.getText().toString();
                    textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null,null);
                }}

            });



            }
        });


    }
}