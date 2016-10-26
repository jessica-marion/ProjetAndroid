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

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.circle_red));
                Intent myIntent = new Intent(getBaseContext(), MainActivity2.class);
                startActivityForResult(myIntent, 0);

            }
        });

    }
}

