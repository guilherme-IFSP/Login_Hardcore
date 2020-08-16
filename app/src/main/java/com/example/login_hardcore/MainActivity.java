package com.example.login_hardcore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static EditText editTextNroPontuario;
    public static EditText edittextSenha;
    public static Button btnLogin;
    public static TextView textViewResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNroPontuario = findViewById(R.id.edittext_nropontuario);
        edittextSenha = findViewById(R.id.edittext_senha);
        btnLogin = findViewById(R.id.button_login);
        textViewResultado = findViewById(R.id.textview_resultado);
        btnLogin.setOnClickListener(onClickLogin());
    }
    private View.OnClickListener onClickLogin(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String prontuario = editTextNroPontuario.getText().toString();
                String senha = edittextSenha.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("KEY_PRONTUARIO",prontuario);
                    bundle.putString("KEY_SENHA",senha);
                    if(prontuario.length()==0||senha.length()==0)
                        alert("Os campos usuário e senha devem ser preenchidos");
                    else{
                            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
            }
        };
    }
    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }


}