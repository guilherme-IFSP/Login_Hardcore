package com.example.login_hardcore;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView res_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        res_login =  findViewById(R.id.textview_resultado);
        Bundle bundle = getIntent().getExtras();
        String valida_prontuario = bundle.getString("KEY_PRONTUARIO");
        String valida_senha = bundle.getString("KEY_SENHA");
        LoginValidation(valida_prontuario,valida_senha);
    }
    private void LoginValidation(String pontuario,String senha){
        if(pontuario.equals("3001288")&&senha.equals("8821003")){
            res_login.setText("Bem vindo 3001288");
        }
        else
            res_login.setText("Erro no Login");
    }
}