package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    Button btn_cadastrar;
    EditText et_cemail, et_cpass;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btn_cadastrar = findViewById(R.id.btn_cadastrar);
        et_cemail = findViewById(R.id.et_cemail);
        et_cpass = findViewById(R.id.et_cpass);

    }
}