package com.example.jadwalsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BacaanSholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacaan_sholat);
    }

    public void niat(View view) {
        Intent intent = new Intent(BacaanSholat.this,niat.class);
        startActivity(intent);
    }

    public void rukuk(View view) {
        Intent intent = new Intent(BacaanSholat.this,rukuk.class);
        startActivity(intent);
    }

    public void itidal(View view) {
        Intent intent = new Intent(BacaanSholat.this,itidal.class);
        startActivity(intent);
    }

    public void qunut(View view) {
        Intent intent = new Intent(BacaanSholat.this,qunut.class);
        startActivity(intent);
    }

    public void sujud(View view) {
        Intent intent = new Intent(BacaanSholat.this,sujud.class);
        startActivity(intent);
    }

    public void tasyahudawal(View view) {
        Intent intent = new Intent(BacaanSholat.this,tasyahudawal.class);
        startActivity(intent);
    }

    public void tasyahudakhir(View view) {
        Intent intent = new Intent(BacaanSholat.this,tasyahudakhir.class);
        startActivity(intent);
    }

    public void salam(View view) {
        Intent intent = new Intent(BacaanSholat.this,salam.class);
        startActivity(intent);
    }

    public void doaIftitah(View view) {
            Intent intent = new Intent(BacaanSholat.this, Iftitah.class);
            startActivity(intent);
        }
}