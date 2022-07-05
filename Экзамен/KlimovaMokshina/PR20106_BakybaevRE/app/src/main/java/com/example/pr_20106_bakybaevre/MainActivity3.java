package com.example.pr_20106_bakybaevre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void next (View view) {
//Переход на mainactivity2
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}