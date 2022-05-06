package com.example.jadwalsholat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void BacaanSholat(View view) {
        Intent intent = new Intent(MainActivity.this,BacaanSholat.class);
        startActivity(intent);
    }

    public void tentangapp(View view) {
        Intent intent = new Intent(MainActivity.this,tentangApp.class);
        startActivity(intent);
    }
}