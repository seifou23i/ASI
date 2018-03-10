package com.example.ubuntu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent scanner;
    Intent generator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void QrScanner(View view){
        scanner = new Intent(MainActivity.this,
                QR_Scanner.class);
        startActivity(scanner);


    }
    public void QrGenerator (View view){
        generator = new Intent(MainActivity.this,
                QR_Generator.class);
        startActivity(generator);

    }

}
