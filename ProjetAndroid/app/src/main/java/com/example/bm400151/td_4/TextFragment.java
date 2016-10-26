package com.example.bm400151.td_4;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmentbtext, container, false);
        return v;
    }

    public void changerNombre(int n) {
        //((TextView)getView().findViewById(R.id.textView)).setText(String.valueOf(n));
        ((MyView)getView().findViewById(R.id.imageView)).setNombreObjet(n);
    }



    public void changerNombreSeekBar( int n ) {
        //((TextView)getView().findViewById(R.id.textView2)).setText(String.valueOf(n));
        ((MyView)getView().findViewById(R.id.imageView)).setDx(n);
        ((MyView)getView().findViewById(R.id.imageView)).setDy(n);
    }

    public int getPosition(int position){
        return position;
    }



    public void changerColorImage( int positionImage, int positionColor){
        if( positionImage == 0){
            if(positionColor == 0){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.circle_red);
            }
            if ( positionColor == 1){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.circle_yellow);
            }
            if ( positionColor == 2){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.circle_green);
            }
            if ( positionColor == 3){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.circle_blue);
            }
            if ( positionColor == 4){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.circle_purple);
            }

        }
        if( positionImage == 1){
            if(positionColor == 0){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.diamond_red);
            }
            if ( positionColor == 1){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.diamond_yellow);
            }
            if ( positionColor == 2){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.diamond_green);
            }
            if ( positionColor == 3){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.diamond_blue);
            }
            if ( positionColor == 4){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.diamond_purple);
            }
        }
        if( positionImage == 2){
            if(positionColor == 0){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.heart_red);
            }
            if ( positionColor == 1){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.heart_yellow);
            }
            if ( positionColor == 2){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.heart_green);
            }
            if ( positionColor == 3){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.heart_blue);
            }
            if ( positionColor == 4){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.heart_purple);
            }
        }
        if( positionImage == 3){
            if(positionColor == 0){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.triangle_red);
            }
            if ( positionColor == 1){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.triangle_yellow);
            }
            if ( positionColor == 2){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.triangle_green);
            }
            if ( positionColor == 3){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.triangle_blue);
            }
            if ( positionColor == 4){
                ((MyView)getView().findViewById(R.id.imageView)).setImageResource(R.drawable.triangle_purple);
            }
        }
    }


    public void changerValeurScore(int a) {
        ((TextView)getView().findViewById(R.id.textView5)).setText(String.valueOf(a));
    }
}


