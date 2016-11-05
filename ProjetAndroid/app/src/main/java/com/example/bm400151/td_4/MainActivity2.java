package com.example.bm400151.td_4;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity2 extends Activity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        final Button loginButton = (Button) findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        final Button regleButton = (Button) findViewById(R.id.button2);
        regleButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, regle.class);
                startActivity(intent);

            }
        });

        final Button quitButton = (Button) findViewById(R.id.button3);
        quitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final Button NiveauButton = (Button) findViewById(R.id.bouton1);
        NiveauButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Level.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

