package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText et_email, et_pass;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        et_email = findViewById(R.id.et_email);
        et_pass = findViewById(R.id.et_pass);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = et_email.getText().toString().trim();
                String senha = et_pass.getText().toString().trim();
                i = getIntent();
                String username = i.getExtras().getString("username");
                String password = i.getExtras().getString("password");

                if(login.isEmpty() || senha.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Preencha os campos!", Toast.LENGTH_SHORT).show();
                } else if(login.equals(username) && senha.equals(password)){
                    i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);
                } else{
                    Toast.makeText(LoginActivity.this, "Login ou senha inválidos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}