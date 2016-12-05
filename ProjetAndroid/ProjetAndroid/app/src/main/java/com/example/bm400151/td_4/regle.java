package com.example.bm400151.td_4;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

/**
 * Created by bm400151 on 31/10/2016.
 */
public class regle extends Activity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reglement);


        final Button homeButton = (Button) findViewById(R.id.button4);
        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(regle.this, MainActivity2.class);
                //startActivity(intent);
                finish();
            }
        });

        final Button playButton = (Button) findViewById(R.id.button5);
        playButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(regle.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
