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
import android.widget.Toast;

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



    public void changerColorImage( int positionImage, int positionColor) {
        if (positionImage == 0) {
            if (positionColor == 0) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.cow_blue);
                Toast.makeText(getContext(), "Tu as séléctionné une vache bleue", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 1) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.cow_green);
                Toast.makeText(getContext(), "Tu as séléctionné une vache verte", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 2) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.cow_white);
                Toast.makeText(getContext(), "Tu as séléctionné une vache blanche", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 3) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.cow_brown);
                Toast.makeText(getContext(), "Tu as séléctionné une vache marron", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 4) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.cow_grey);
                Toast.makeText(getContext(), "Tu as séléctionné une vache grise", Toast.LENGTH_SHORT).show();
            }

        }
        if (positionImage == 1) {
            if (positionColor == 0) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.tree_bleu);
                Toast.makeText(getContext(), "Tu as séléctionné le sapin bleu", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 1) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.tree_green);
                Toast.makeText(getContext(), "Tu as séléctionné le sapin vert", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 2) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.tree_blanc);
                Toast.makeText(getContext(), "Tu as séléctionné le sapin blanc", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 3) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.tree_brown);
                Toast.makeText(getContext(), "Tu as séléctionné le sapin marron", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 4) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.tree_grey);
                Toast.makeText(getContext(), "Tu as séléctionné le sapin gris", Toast.LENGTH_SHORT).show();
            }
        }
        if (positionImage == 2) {
            if (positionColor == 0) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.squirrel_blue);
                Toast.makeText(getContext(), "Tu as séléctionné l'écureuil bleu\n"+" Woahh tu as de l'imagination", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 1) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.squirrel_green);
                Toast.makeText(getContext(), "Tu as séléctionné l'écureuil vert\n" +
                        " Woahh tu as de l'imagination", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 2) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.squirrel_white);
                Toast.makeText(getContext(), "Tu as séléctionné l'écureuil blanc" , Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 3) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.squirrel_brown);
                Toast.makeText(getContext(), "Tu as séléctionné l'écureuil marron", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 4) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.squirrel_grey);
                Toast.makeText(getContext(), "Tu as séléctionné l'écureuil gris", Toast.LENGTH_SHORT).show();
            }
        }
        if (positionImage == 3) {
            if (positionColor == 0) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.flake_blue);
                Toast.makeText(getContext(), "Tu as séléctionné un flocon bleu", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 1) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.flake_green);
                Toast.makeText(getContext(), "Tu as séléctionné un flocon vert", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 2) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.flake_white);
                Toast.makeText(getContext(), "Tu as séléctionné un flocon blanc", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 3) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.flake_brown);
                Toast.makeText(getContext(), "Tu as séléctionné un flocon marron", Toast.LENGTH_SHORT).show();
            }
            if (positionColor == 4) {
                ((MyView) getView().findViewById(R.id.imageView)).setImageResource(R.drawable.flake_grey);
                Toast.makeText(getContext(), "Tu as séléctionné un flocon gris", Toast.LENGTH_SHORT).show();

            }
        }

    }


    public void changerValeurScore(int a) {
        ((TextView)getView().findViewById(R.id.textView5)).setText(String.valueOf(a));
    }
}


