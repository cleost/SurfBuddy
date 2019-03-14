package com.example.surfbuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    private String usuarioValor;

    private String senhaValor;

    @ViewById(R.id.senha)
    public EditText senha;

    @ViewById(R.id.usuario)
    public EditText usuario;

    @Click(R.id.esqueceu_senha)
    void clickEsqueceuSenha(){
        Intent intent = new Intent(this, EsqueceuSenha_.class);
        startActivity(intent);
    }

    @Click({R.id.button})
    void clickedButton(){
        usuarioValor = usuario.getText().toString();
        senhaValor = senha.getText().toString();

        if(verificarAcesso(usuarioValor, senhaValor)){
            //acesso valido
            Intent intent = new Intent(this, Inicial_.class);
            startActivity(intent);
        }else{
            //acesso invalidov
        }

    }

    public boolean verificarAcesso(String usuario, String senha){
        return true;
    }
}
