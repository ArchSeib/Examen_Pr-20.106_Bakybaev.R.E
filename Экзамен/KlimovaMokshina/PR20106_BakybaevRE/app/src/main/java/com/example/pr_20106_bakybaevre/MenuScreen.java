package com.example.pr_20106_bakybaevre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Загружаю меню на страницу
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}