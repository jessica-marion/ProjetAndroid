package com.example.bm400151.td_4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.AttributeSet;

import android.view.MotionEvent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class MyView extends ImageView {

    int x;
    int y;
    int hb;
    int wb;
    int resID;
    int dx = 1;
    int dy = 1;
    int nombreObjet = 1;

    int x1 = 0;
    int y1 = 0;
    int x2 = 100;
    int y2 = 50;
    int x3 = 300;
    int y3 = 90;
    int x4 = 60;
    int y4 = 100;

    int score = 0;



    public void tableauPoint(int valeurVitesse){

        x1 = x1 + valeurVitesse;
        y1 = y1 + valeurVitesse;
        x2 = x2 + valeurVitesse;
        y2 = y2 + valeurVitesse;
        x3 = x3 + valeurVitesse;
        y3 = y3 + valeurVitesse;
        x4 = x4 + valeurVitesse;
        y4 = y4 + valeurVitesse;


    }


    public void setDx(int uneVitesse){
        dx = uneVitesse;
    }

    public void setDy(int uneVitesse){
        dy = uneVitesse;
    }

    public void setNombreObjet(int unNombreObjet){
        nombreObjet = unNombreObjet;
    }


    Paint BackPaint = new Paint();
    Context MyContext;



    public MyView(Context context) {
        super(context);
        init(context);

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context ctx){
        MyContext = ctx;
        BackPaint.setStyle(Paint.Style.FILL);
        BackPaint.setColor(Color.BLACK);
        x = 0;
        y = 0;
        removeCallbacks(animator);
        post(animator);
        resID = R.drawable.circle;

    }



    public int getVitesse(int vitesse){
        return vitesse;
    }

    @Override
    public void setImageResource(int resId) {
        this.resID = resId;
        super.setImageResource(resId);
    }

    public int getResourceId() {
        return resID;
    }

    public int randomEntreDeuxValeurs(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public void direction(){

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int w = MeasureSpec.getSize(widthMeasureSpec);
        int h = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(w, h);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        float xe = event.getX();
        float ye = event.getY();
        switch(event.getAction())
        {

            case MotionEvent.ACTION_DOWN:
                //Check if the x and y position of the touch is inside the bitmap
                if( xe > x && xe < x + wb && ye > y && ye < y + hb )
                {
                    if (score == 11 ){
                        MediaPlayer player= MediaPlayer.create(MyContext,R.raw.win);

                        player.start();
                        score = 0;

                    }
                    else {
                        Toast.makeText(getContext(), "Gagné ..." + score, Toast.LENGTH_SHORT).show();
                        // Get instance of Vibrator from current Context
                        Vibrator v = (Vibrator) MyContext.getSystemService(Context.VIBRATOR_SERVICE);


                        v.vibrate(1000);
                        score = score + 1;

                    }

                }

                return true;
        }

        return false;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint MyPaint = new Paint();
        MyPaint.setStyle(Paint.Style.FILL);
        Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), resID);
        hb = myBitmap.getHeight();
        wb = myBitmap.getWidth();
        tableauPoint(dx);
        if(nombreObjet == 1 ){
            canvas.drawBitmap(myBitmap, x, y, null);
        }
        if(nombreObjet == 2 ){
            canvas.drawBitmap(myBitmap, x, y, null);
            canvas.drawBitmap(myBitmap, x1, y1, null);
        }
        if(nombreObjet == 3 ){
            canvas.drawBitmap(myBitmap, x, y, null);
            canvas.drawBitmap(myBitmap, x1, y1, null);
            canvas.drawBitmap(myBitmap, x2, y2, null);
        }
        if(nombreObjet == 4 ){
            canvas.drawBitmap(myBitmap, x, y, null);
            canvas.drawBitmap(myBitmap, x1, y1, null);
            canvas.drawBitmap(myBitmap, x2, y2, null);
            canvas.drawBitmap(myBitmap, x3, y3, null);
        }
        if(nombreObjet == 5 ){
            canvas.drawBitmap(myBitmap, x, y, null);
            canvas.drawBitmap(myBitmap, x1, y1, null);
            canvas.drawBitmap(myBitmap, x2, y2, null);
            canvas.drawBitmap(myBitmap, x3, y3, null);
            canvas.drawBitmap(myBitmap, x4, y4, null);
        }
        /*canvas.drawBitmap(myBitmap, x, y, null);
        canvas.drawBitmap(myBitmap, x1, y1, null);*/

    /*
        for(i = 0; i<nombreObjet; i++) {

            //canvas.drawBitmap(myBitmap, x = randomEntreDeuxValeurs(0, getWidth()), y = randomEntreDeuxValeurs(0, getHeight()), null);
        }*/
    };

    private Runnable animator = new Runnable() {
        @Override
        public void run() {
            //long now = AnimationUtils.currentAnimationTimeMillis();
            update(); // permet de deplacer les objets
            invalidate();
            //if(!isAtRest()) { //isAtRest  != coordonnées ont atteintes la destination finale ou !=temps de l'animation
            postDelayed(this, 14);
            //}
        }
    };

    private boolean collisionx(int xVal){
        if(xVal < 0 || xVal > getWidth()-hb){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean collisiony(int yVal){
        if(yVal < 0 || yVal > getHeight()-wb){
            return true;
        }
        else{
            return false;
        }
    }

    private void update(){
        if(nombreObjet == 1){
            if(collisionx(x)){
                dx *=-1;
            }
            if(collisiony(y)) {
                dy *= -1;
            }
            x += dx;
            y += dy;
        }
        if(nombreObjet == 2){
            if(collisionx(x) || collisionx(x1)){
                dx *=-1;
            }
            if(collisiony(y) || collisiony(y1)) {
                dy *= -1;
            }
            x += dx;
            y += dy;
            x1 += dx;
            y1 += dy;

        }
        if(nombreObjet == 3){
            if(collisionx(x) || collisionx(x1) || collisiony(x2) ){
                dx *=-1;
            }
            if(collisiony(y) || collisiony(y1) || collisiony(y2)) {
                dy *= -1;
            }
            x += dx;
            y += dy;
            x1 += dx;
            y1 += dy;
            x2 += dx;
            y2 += dy;

        }
        if(nombreObjet == 4){
            if(collisionx(x) || collisionx(x1) || collisiony(x2) || collisiony(x3)){
                dx *=-1;
            }
            if(collisiony(y) || collisiony(y1) || collisiony(y2) || collisiony(y3)) {
                dy *= -1;
            }
            x += dx;
            y += dy;
            x1 += dx;
            y1 += dy;
            x2 += dx;
            y2 += dy;
            x3 += dx;
            y3 += dy;

        }
        if(nombreObjet == 5){
            if(collisionx(x) || collisionx(x1) || collisiony(x2) || collisiony(x3)|| collisiony(x4)){
                dx *=-1;
            }
            if(collisiony(y) || collisiony(y1)|| collisiony(y2) || collisiony(y3)|| collisiony(y4)) {
                dy *= -1;
            }
            x += dx;
            y += dy;
            x1 += dx;
            y1 += dy;
            x2 += dx;
            y2 += dy;
            x3 += dx;
            y3 += dy;
            x4 += dx;
            y4 += dy;

        }/*
        if(collisionx()){
            dx *=-1;
        }
        if(collisiony()) {
            dy *= -1;
        }
        x += dx;
        y += dy;*/
    }






    /*private boolean isAtRest(){
        if(x<getWidth()-hb && y<getHeight()-wb) return false;
        else return true;
    }*/
};


