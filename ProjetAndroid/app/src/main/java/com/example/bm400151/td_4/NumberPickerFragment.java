package com.example.bm400151.td_4;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class NumberPickerFragment extends Fragment {

    int imagePosition;
    int colorPosition;

    public NumberPickerFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragmentaumberpicker, container, false);


        Gallery g = (Gallery) v.findViewById(R.id.gallery);
        g.setAdapter(new ImageAdapter(getContext()));

        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView parent, View v,
                                    int position, long id) {
                /*Toast.makeText(getContext(), "" + position,
                        Toast.LENGTH_SHORT).show();*/
                //mListener.onActionImage(position);
                imagePosition = mListener.onActionPosition(position);

            }
        });

        g.setSelection(2);

        /* color */
        Gallery color = (Gallery) v.findViewById(R.id.gallery2);


        color.setAdapter(new ColorAdapter((getContext())));
        color.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v,
                                    int position, long id) {
                /*Toast.makeText(getContext(), "" + position,
                        Toast.LENGTH_SHORT).show();*/
                //mListener.onActionColor(position);
                colorPosition = mListener.onActionPosition(position);
                mListener.onActionColorImage(imagePosition,colorPosition);
               /* Toast.makeText(getContext(), "" + colorPosition + "/"+ imagePosition,
                        Toast.LENGTH_SHORT).show();*/
                }
        });

        color.setSelection(2);

        NumberPicker n = ((NumberPicker)v.findViewById(R.id.numberPicker));

        final SeekBar seekbar = ((SeekBar)v.findViewById(R.id.seekBar));
        final TextView test = ((TextView)v.findViewById(R.id.textView4));




        n.setMinValue(1);
        n.setMaxValue(5);



        n.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                mListener.onAction(newVal);
            }
        });


        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int result;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                int vitesse = 0 ;
                result = seekbar.getProgress();
                vitesse = ((result/10)+1);
                if(vitesse == 11){
                    vitesse = 10;
                }
                test.setText(String.valueOf(vitesse));
                mListener.onActionSeekBar(vitesse);
            }
        });

        return v;
    }





    public interface OnActionListener {
        public void onAction(int d);

        void onActionSeekBar(int d);
        void onActionImage(int d);
        void onActionColor(int d);

        void onActionColorImage(int a, int b);

        void onClick(View view);

        int onActionPosition(int a);


    }

    OnActionListener mListener;



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnActionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnActionListener");
        }
    }





}

class ImageAdapter extends BaseAdapter {
    int mGalleryItemBackground;
    private Context mContext;
    // tous les éléments de ImageAdapter
// les références vers les ressources d’images
    private Integer[] mImageIds = {R.drawable.cow, R.drawable.tree, R.drawable.squirrel, R.drawable.flake};
    public ImageAdapter(Context c) {
// le contexte correspond à l’Ativity en cours d’exécution
// ici c’est GalleryAndroidActivity
        mContext = c;
// initialisation de la gallery avec un style
// fichier attrs.xml à créer (voir suite)
        TypedArray a = mContext.obtainStyledAttributes(
                R.styleable.GalleryAndroid);
        mGalleryItemBackground = a.getResourceId(
                R.styleable.GalleryAndroid_android_galleryItemBackground, 0);
        a.recycle();
    }
    // implémentation des méthodes de BaseAdapter
    public int getCount() {
        return mImageIds.length;
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    // cette méthode renvoit la vue pour un élément de BaseAdapter
    public View getView(int position, View convertView,ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(170, 190));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);
        return i;
    }
}


class ColorAdapter extends BaseAdapter {
    int mGalleryItemBackground;
    private Context mContext;
    // tous les éléments de ImageAdapter
// les références vers les ressources d’images
    private Integer[] mImageIds = {R.drawable.blue, R.drawable.green, R.drawable.white, R.drawable.brown,R.drawable.grey};
    public ColorAdapter(Context c) {
// le contexte correspond à l’Ativity en cours d’exécution
// ici c’est GalleryAndroidActivity
        mContext = c;
// initialisation de la gallery avec un style
// fichier attrs.xml à créer (voir suite)
        TypedArray a = mContext.obtainStyledAttributes(
                R.styleable.GalleryAndroid);
        mGalleryItemBackground = a.getResourceId(
                R.styleable.GalleryAndroid_android_galleryItemBackground, 0);
        a.recycle();
    }
    // implémentation des méthodes de BaseAdapter
    public int getCount() {
        return mImageIds.length;
    }
    public Object getItem(int position) {
        return position;
    }
    public long getItemId(int position) {
        return position;
    }
    // cette méthode renvoit la vue pour un élément de BaseAdapter
    public View getView(int position, View convertView,ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        i.setImageResource(mImageIds[position]);
        i.setLayoutParams(new Gallery.LayoutParams(170, 190));
        i.setScaleType(ImageView.ScaleType.FIT_XY);
        i.setBackgroundResource(mGalleryItemBackground);
        return i;
    }
}