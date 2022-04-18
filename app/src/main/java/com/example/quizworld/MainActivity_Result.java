package com.example.quizworld;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_Result extends AppCompatActivity {
    TextView textView;
    Button button_return_mainmenu;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);
        Intent intent = getIntent();
        String score = intent.getStringExtra(Activity1.FINAL_SCORE);
        textView = findViewById(R.id.textView3);
        textView.setText(score+"/5");

        button_return_mainmenu = findViewById(R.id.button2);
        button_return_mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1  = new Intent(MainActivity_Result.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}