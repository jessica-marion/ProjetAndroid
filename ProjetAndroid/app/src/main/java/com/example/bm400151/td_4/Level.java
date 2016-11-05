package com.example.bm400151.td_4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Jean-Marc on 03/11/2016.
 */

public class Level extends Activity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);


        final Button retour = (Button) findViewById(R.id.button58);
        retour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final Button niveau1 = (Button) findViewById(R.id.button24);
        niveau1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity2.class);
                MyView.setNiveau(1);
                startActivity(intent);
                finish();
            }
        });

        final Button niveau2 = (Button) findViewById(R.id.button25);
        niveau2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(2);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau3 = (Button) findViewById(R.id.button26);
        niveau3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(3);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau4 = (Button) findViewById(R.id.button27);
        niveau4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(4);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau5 = (Button) findViewById(R.id.button52);
        niveau5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(5);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau6 = (Button) findViewById(R.id.button53);
        niveau6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(6);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau7 = (Button) findViewById(R.id.button54);
        niveau7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(7);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau8 = (Button) findViewById(R.id.button55);
        niveau8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(8);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau9 = (Button) findViewById(R.id.button56);
        niveau9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(9);
                startActivity(intent);
                finish();
            }
        });
        final Button niveau10 = (Button) findViewById(R.id.button57);
        niveau10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level.this, MainActivity.class);
                MyView.setNiveau(10);
                startActivity(intent);
                finish();
            }
        });



    }
}
