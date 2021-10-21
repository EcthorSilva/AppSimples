package com.example.atividademobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sair = findViewById(R.id.btn_sair);

        // Função do botão de sair
        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Indo para a janela de Login
                startActivity(new Intent(getApplicationContext(),
                        LoginActivity.class));
                finish(); // Fechando a Janela principal
            }
        });

    }
}