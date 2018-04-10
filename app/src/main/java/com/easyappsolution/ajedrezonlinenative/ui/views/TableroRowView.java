package com.easyappsolution.ajedrezonlinenative.ui.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.easyappsolution.ajedrezonlinenative.R;


/**
 * Created by makhnnar on 07/04/18.
 */

public class TableroRowView extends ConstraintLayout{

    private AppCompatImageView img1;
    private AppCompatImageView img2;
    private AppCompatImageView img3;
    private AppCompatImageView img4;
    private AppCompatImageView img5;
    private AppCompatImageView img6;
    private AppCompatImageView img7;
    private AppCompatImageView img8;

    public TableroRowView(Context context) {
        super(context);
        init(null,context);
    }

    public TableroRowView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs,context);
    }

    public TableroRowView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs,context);
    }

    private void init(@Nullable AttributeSet set,Context context){
        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_tablero_row, this, true);
        img1 = (AppCompatImageView) findViewById(R.id.col_1);
        img2 = (AppCompatImageView) findViewById(R.id.col_2);
        img3 = (AppCompatImageView) findViewById(R.id.col_3);
        img4 = (AppCompatImageView) findViewById(R.id.col_4);
        img5 = (AppCompatImageView) findViewById(R.id.col_5);
        img6 = (AppCompatImageView) findViewById(R.id.col_6);
        img7 = (AppCompatImageView) findViewById(R.id.col_7);
        img8 = (AppCompatImageView) findViewById(R.id.col_8);
    }

    public void setBackgroundRow(int startBlack){
        if(startBlack==1){
            img1.setBackgroundColor(getResources().getColor(R.color.black));
            img2.setBackgroundColor(getResources().getColor(R.color.white));
            img3.setBackgroundColor(getResources().getColor(R.color.black));
            img4.setBackgroundColor(getResources().getColor(R.color.white));
            img5.setBackgroundColor(getResources().getColor(R.color.black));
            img6.setBackgroundColor(getResources().getColor(R.color.white));
            img7.setBackgroundColor(getResources().getColor(R.color.black));
            img8.setBackgroundColor(getResources().getColor(R.color.white));
        }else{
            img1.setBackgroundColor(getResources().getColor(R.color.white));
            img2.setBackgroundColor(getResources().getColor(R.color.black));
            img3.setBackgroundColor(getResources().getColor(R.color.white));
            img4.setBackgroundColor(getResources().getColor(R.color.black));
            img5.setBackgroundColor(getResources().getColor(R.color.white));
            img6.setBackgroundColor(getResources().getColor(R.color.black));
            img7.setBackgroundColor(getResources().getColor(R.color.white));
            img8.setBackgroundColor(getResources().getColor(R.color.black));
        }
    }
}
