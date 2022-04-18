package com.example.quizworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void StartQuiz(View view){
        Toast.makeText(this, "Starting Quiz", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, Activity_choose.class);
        startActivity(intent);
    }

}