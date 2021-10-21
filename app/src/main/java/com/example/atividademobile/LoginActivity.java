package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn_login, btn_cadastro;
    EditText et_email, et_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_cadastro = findViewById(R.id.btn_cadastro);
        et_email = findViewById(R.id.et_email);
        et_pass = findViewById(R.id.et_pass);

        // Função do botão de cadastro
        btn_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Indo para a janela de cadastro
                startActivity(new Intent(getApplicationContext(),
                        CadastroActivity.class));
                finish(); // Fechando a Janela de Login
            }
        });

        // Função que simula o login do usuario
        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String email, senha;

                email = et_email.getText().toString();
                senha = et_pass.getText().toString();

                if(email.equals("ecthor@etec.com") && senha.equals("1234")){
                    startActivity(new Intent(getApplicationContext(),
                            MainActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(),
                            "Usuario ou senha inválidos!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}