package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ogrenciGirisLogin extends AppCompatActivity {

    private Button studentGiris;
    private EditText studentId, studentPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrenci_giris_login);

        studentId = (EditText) findViewById(R.id.studentId);
        studentPassword = (EditText) findViewById(R.id.studentPassword);
        studentGiris = (Button) findViewById(R.id.studentGiris);
    }


    public void oanasayfa (View view){

        if(studentId.getText().toString().equals("student")&&studentPassword.getText().toString().equals("123")) {

            Intent ıntent = new Intent(getApplicationContext(), ogrenciAnaSayfa.class);
            startActivity(ıntent);
        }
        else{
            Toast.makeText(getApplicationContext(),"GİRİŞ HATALI",Toast.LENGTH_SHORT).show();
        }
        }
}
