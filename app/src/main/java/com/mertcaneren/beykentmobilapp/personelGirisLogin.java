package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class personelGirisLogin extends AppCompatActivity {

    private Button personelgiris;
    private EditText personelid, personelpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personel_giris_login);

        personelid = (EditText) findViewById(R.id.personelid);
        personelpassword = (EditText) findViewById(R.id.personelpassword);
        personelgiris = (Button) findViewById(R.id.personelgiris);

    }



    public void panasyf (View view){

        if(personelid.getText().toString().equals("personel")&&personelpassword.getText().toString().equals("123")) {

            Intent ıntent = new Intent(getApplicationContext(), personelAnaSayfa.class);
            startActivity(ıntent);
        }
        else{
            Toast.makeText(getApplicationContext(),"GİRİŞ HATALI",Toast.LENGTH_SHORT).show();
        }
    }
}
