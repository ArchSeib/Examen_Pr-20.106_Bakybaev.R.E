package com.example.pr_20106_bakybaevre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AutorizationScreen extends AppCompatActivity {

    EditText ETLogin = findViewById(R.id.LoginETAutorization);
    EditText ETPassword = findViewById(R.id.PasswordETAutorization);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autorization_screen);
    }
    public void Validation(View view)
    {
        //Валидация
        String TruePassword = "Passw0rd";
        String TrueLogin = "L0gin";
        boolean key = true;
        String Login  =ETLogin.getText().toString();
        String Password  =ETPassword.getText().toString();
        if(Login.equals(""))
        {
            Toast toast = Toast.makeText(this, "Вы не ввели логин!",Toast.LENGTH_LONG);
            toast.show();
            key = false;
        }
        if(Password.equals(""))
        {
            Toast toast = Toast.makeText(this, "Вы не ввели пароль!",Toast.LENGTH_LONG);
            toast.show();
            key = false;
        }
        if(!Login.equals(TrueLogin))
        {
            Toast toast = Toast.makeText(this, "Неправильный логин",Toast.LENGTH_LONG);
            toast.show();
            key = false;
        }
        if(Password.equals(TruePassword))
        {
            Toast toast = Toast.makeText(this, "Неправильный пароль!",Toast.LENGTH_LONG);
            toast.show();
            key = false;
        }
        if(key)
        {
            Intent intent = new Intent(this, MenuScreen.class);
            startActivity(intent);
        }
    }
    public void Goregistration (View view) {

        Intent intent = new Intent(this, RegistrationScreen.class);
        startActivity(intent);
    }

}