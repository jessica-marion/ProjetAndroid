package com.example.bm400151.td_4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.ActionBar;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NumberPickerFragment.OnActionListener  {

    ViewPager mViewPager;

    ExamplePagerAdapter adapter;

    int mData = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ExamplePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);




        mViewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        getSupportActionBar().setSelectedNavigationItem(position);
                    }
                });

        final android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS); // problem with ActionBar.NAVIGATION_MODE_TABS underline in red

        actionBar.addTab(
                actionBar.newTab()
                        .setText("Selection")
                        .setTabListener(tabListener));
        actionBar.addTab(
                actionBar.newTab()
                        .setText("Jeu")
                        .setTabListener(tabListener));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.action_quitter) {

            Toast.makeText(this, "quitter", Toast.LENGTH_LONG).show();
            finish();
            return true;
        }

        if (id == R.id.action_Score) {

            Intent intent = new Intent(this,testbd.class);
            this.startActivity(intent);
            return true;
        }

        if (id == R.id.action_reglement) {
            Intent sendSms = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0629768968"));
            sendSms.putExtra("sms_boby","Mon premier sms");
            startActivity(sendSms);
            Intent intent = new Intent(this,regle.class);
            this.startActivity(intent);
            return true;
        }

        if (id == R.id.action_main) {
            Intent intent = new Intent(this,MainActivity2.class);
            this.startActivity(intent);
            return true;
        }
        if (id == R.id.action_messageRetour) {
            Intent intent = new Intent(this,sendMessage.class);
            this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    android.support.v7.app.ActionBar.TabListener tabListener = new android.support.v7.app.ActionBar.TabListener() {
        @Override
        public void onTabSelected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
            mViewPager.setCurrentItem(tab.getPosition());

        }

        @Override
        public void onTabUnselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

        }

        @Override
        public void onTabReselected(android.support.v7.app.ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

        }
    };



    @Override
    public void onAction(int d) {
        mData = d;
        ((TextFragment)adapter.getItem(1)).changerNombre(d);//numberpicker value
    }

    @Override
    public void onActionSeekBar(int d) {
        mData = d;
        //((TextFragment)adapter.getItem(1)).changerNombreSeekBar(String.valueOf(d)); // seekBar value
        ((TextFragment)adapter.getItem(1)).changerNombreSeekBar(d);
    }


    @Override
    public void onActionImage(int a) {
        //((TextFragment)adapter.getItem(1)).changerImage(a); // imageView value
    }

    @Override
    public void onActionColor(int b) {
        //((TextFragment)adapter.getItem(1)).changerColor(b); // imageView value
    }

    @Override
    public void onActionColorImage(int a, int b) {
        ((TextFragment)adapter.getItem(1)).changerColorImage(a,b); // imageView value
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public int onActionPosition(int a) {
        return ((TextFragment)adapter.getItem(1)).getPosition(a);
    }



}