package com.example.quizworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Activity_choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }
    public void MLQuiz(View view){
        Toast.makeText(this, "Starting Quiz", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, Activity1.class);
        startActivity(intent);
    }
    public void NNQuiz(View view){
        Toast.makeText(this, "Starting Quiz", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this, Activity2.class);
        startActivity(intent);
    }
    public void PYQuiz(View view){
        Toast.makeText(this, "Starting Quiz", Toast.LENGTH_SHORT).show();
        Intent intent_py =new Intent(Activity_choose.this, Activity3.class);
        startActivity(intent_py);
    }
}