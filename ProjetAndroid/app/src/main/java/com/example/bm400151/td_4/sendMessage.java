package com.example.bm400151.td_4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Jean-Marc on 04/11/2016.
 */

public class sendMessage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });
        Button retour = (Button) findViewById(R.id.retour);
        retour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                finish();
            }
        });
    }
    protected void sendEmail() {
        String[] TO = {"jessica.rosso@laposte.net"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Retour application Pied Piper");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Veuillez entre votre message de retour sur l'application Pied Piper");

        try {
            startActivity(Intent.createChooser(emailIntent, "envoyer message éléctronique"));
            finish();
        }
        catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(sendMessage.this, "Il n'y a pas de d'adresse éléctronique client installé.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
