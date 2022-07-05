package com.example.pr_20106_bakybaevre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationScreen extends AppCompatActivity {

    EditText ETLogin = findViewById(R.id.loginETRegistration);
    EditText ETPassword = findViewById(R.id.passwordETRegistration);
    EditText ETPasswordAgain = findViewById(R.id.passwordETAgainRegistration);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_screen);
    }
    public void Validation(View view)
    {
        //Валидация
        String TruePassword = "Passw0rd";
        String TrueLogin = "L0gin";
        boolean key = true;
        String Login  =ETLogin.getText().toString();
        String Password  =ETPassword.getText().toString();
        String PasswordAgain  =ETPasswordAgain.getText().toString();
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
        if(Password.equals(PasswordAgain))
        {
            Toast toast = Toast.makeText(this, "пароли не совпадают",Toast.LENGTH_LONG);
            toast.show();
            key = false;
        }
        if(key)
        {
            Intent intent = new Intent(this, MenuScreen.class);
            startActivity(intent);
        }
    }
    public void back (View view) {

        Intent intent = new Intent(this, AutorizationScreen.class);
        startActivity(intent);
    }
}