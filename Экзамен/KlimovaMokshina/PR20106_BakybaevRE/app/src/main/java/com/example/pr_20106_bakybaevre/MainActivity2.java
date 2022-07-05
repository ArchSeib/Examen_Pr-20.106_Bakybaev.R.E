package com.example.pr_20106_bakybaevre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void next (View view) {
//Переход на mainactivity1 "Экран авторизации"
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void back (View view) {
//Переход на mainactivity3
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}