package com.example.quizworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    Button button1_t, button1_f;
    Button button2_t, button2_f;
    Button button3_t, button3_f;
    Button button4_t, button4_f;
    Button button5_t, button5_f;
    Button button_find_results;

    public static final String FINAL_SCORE = "com.example.quizworld.SCORE";

    private final String[] answers = {"true", "true", "false", "false", "true"};
    private String[] responses = {"","","","",""};
    private int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button1_t = findViewById(R.id.button5);
        button1_f = findViewById(R.id.button6);
        button2_t = findViewById(R.id.button7);
        button2_f = findViewById(R.id.button8);
        button3_t = findViewById(R.id.button3);
        button3_f = findViewById(R.id.button9);
        button4_t = findViewById(R.id.button10);
        button4_f = findViewById(R.id.button11);
        button5_t = findViewById(R.id.button13);
        button5_f = findViewById(R.id.button14);
        button_find_results = findViewById(R.id.button12);

        button1_t.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                button1_t.setEnabled(false);
                button1_f.setEnabled(true);
                responses[0] = "true";
            }
        });
        button1_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_t.setEnabled(true);
                button1_f.setEnabled(false);
                responses[0] = "false";
            }
        });
        button2_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_t.setEnabled(false);
                button2_f.setEnabled(true);
                responses[1] = "true";
            }
        });
        button2_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_t.setEnabled(true);
                button2_f.setEnabled(false);
                responses[1] = "false";
            }
        });
        button3_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_t.setEnabled(false);
                button3_f.setEnabled(true);
                responses[2] = "true";
            }
        });
        button3_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_t.setEnabled(true);
                button3_f.setEnabled(false);
                responses[2] = "false";
            }
        });
        button4_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_t.setEnabled(false);
                button4_f.setEnabled(true);
                responses[3] = "true";
            }
        });
        button4_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_t.setEnabled(true);
                button4_f.setEnabled(false);
                responses[3] = "false";
            }
        });
        button5_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_t.setEnabled(false);
                button5_f.setEnabled(true);
                responses[4] = "true";
            }
        });
        button5_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_t.setEnabled(true);
                button5_f.setEnabled(false);
                responses[4] = "false";
            }
        });
        button_find_results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0; i<5; i++){
                    Log.d("onclick", responses[i]);
                    if(responses[i].equals(answers[i])){
                        score++;
                    }
                }
                Intent intent = new Intent(Activity2.this, MainActivity_Result.class);
                intent.putExtra(FINAL_SCORE, String.valueOf(score));
                startActivity(intent);
            }
        });

    }
}