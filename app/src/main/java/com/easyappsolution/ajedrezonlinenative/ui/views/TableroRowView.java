package com.easyappsolution.ajedrezonlinenative.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.easyappsolution.ajedrezonlinenative.R;
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnRowListener;


/**
 * Created by makhnnar on 07/04/18.
 */

public class TableroRowView extends ConstraintLayout implements View.OnClickListener{

    private OnRowListener onRowListener;

    private AppCompatImageView img1;
    private AppCompatImageView img2;
    private AppCompatImageView img3;
    private AppCompatImageView img4;
    private AppCompatImageView img5;
    private AppCompatImageView img6;
    private AppCompatImageView img7;
    private AppCompatImageView img8;

    private int id_colum;

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
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        TypedArray a = context.obtainStyledAttributes(set,
                R.styleable.TableroRowView, 0, 0);
        boolean startBlack = a.getBoolean(R.styleable.TableroRowView_startBlack,true);
        id_colum = a.getInteger(R.styleable.TableroRowView_id_colum,0);
        Log.i("COLOR"," ---> STARTBLACK:"+startBlack);
        a.recycle();
        setBackgroundRow(startBlack);
    }

    public void setBackgroundRow(boolean startBlack){
        if(startBlack){
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

    public int getId_colum(){
        return id_colum;
    }

    public int getResCelda(int posInRow){
        return 0; //todo: devolver el recurso segun pos. hacer lista de img
    }

    public void setOnRowListener(OnRowListener onRowListener){
        if(onRowListener!=null)
            this.onRowListener = onRowListener;
    }

    @Override
    public void onClick(View view) {
        if(view.equals(img1)){
            onRowListener.onRowColumTouch(id_colum,1,false);
        }
        else if(view.equals(img2)){
            onRowListener.onRowColumTouch(id_colum,2,false);
        }
        else if(view.equals(img3)){
            onRowListener.onRowColumTouch(id_colum,3,false);
        }
        else if(view.equals(img4)){
            onRowListener.onRowColumTouch(id_colum,4,false);
        }
        else if(view.equals(img5)){
            onRowListener.onRowColumTouch(id_colum,5,false);
        }
        else if(view.equals(img6)){
            onRowListener.onRowColumTouch(id_colum,6,false);
        }
        else if(view.equals(img7)){
            onRowListener.onRowColumTouch(id_colum,7,false);
        }
        else if(view.equals(img8)){
            onRowListener.onRowColumTouch(id_colum,8,false);
        }
    }
}
