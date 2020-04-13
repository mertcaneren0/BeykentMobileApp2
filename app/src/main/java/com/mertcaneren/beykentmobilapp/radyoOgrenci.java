package com.mertcaneren.beykentmobilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class radyoOgrenci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radyo_ogrenci);
    }

    public void oAn(View view){

        Intent ıntent =new Intent(getApplicationContext(),ogrenciAnaSayfa.class);
        startActivity(ıntent);
    }
}
