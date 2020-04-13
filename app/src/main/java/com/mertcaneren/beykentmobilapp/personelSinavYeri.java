package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class personelSinavYeri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personel_sinav_yeri);
    }

    public void pAn(View view){

        Intent ıntent = new Intent(getApplicationContext(),personelAnaSayfa.class);
        startActivity(ıntent);
    }
}
