package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class akademisyenGirisLogin extends AppCompatActivity {

    private Button akademisyengiris;
    private EditText akademisyenid, akademisyenpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademisyen_giris_login);

        akademisyenid = (EditText) findViewById(R.id.akademisyenid);
        akademisyenpassword = (EditText) findViewById(R.id.akademisyenpassword);
        akademisyengiris = (Button) findViewById(R.id.akademisyengiris);
    }
    public void agrs(View view){

        if(akademisyenid.getText().toString().equals("akademisyen")&&akademisyenpassword.getText().toString().equals("123")) {

            Intent ıntent = new Intent(getApplicationContext(), akademisyenAnaSayfa.class);
            startActivity(ıntent);
        }
        else{
            Toast.makeText(getApplicationContext(),"GİRİŞ HATALI",Toast.LENGTH_SHORT).show();
        }
    }
}
