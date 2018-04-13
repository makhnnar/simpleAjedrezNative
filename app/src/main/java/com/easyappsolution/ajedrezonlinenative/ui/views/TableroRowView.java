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

import java.util.ArrayList;


/**
 * Created by makhnnar on 07/04/18.
 */

public class TableroRowView extends ConstraintLayout implements View.OnClickListener{

    private OnRowListener onRowListener;

    private int id_colum;

    private ArrayList<AppCompatImageView> celdas = new ArrayList<AppCompatImageView>();

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

        celdas.add( (AppCompatImageView) findViewById(R.id.col_1));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_2));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_3));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_4));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_5));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_6));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_7));
        celdas.add( (AppCompatImageView) findViewById(R.id.col_8));


        for(AppCompatImageView celda : celdas){
            celda.setOnClickListener(this);
        }

        TypedArray a = context.obtainStyledAttributes(set,
                R.styleable.TableroRowView, 0, 0);
        boolean startBlack = a.getBoolean(R.styleable.TableroRowView_startBlack,true);
        id_colum = a.getInteger(R.styleable.TableroRowView_id_colum,0);
        Log.i("COLOR"," ---> STARTBLACK:"+startBlack);
        a.recycle();
        setBackgroundRow(startBlack);
    }

    public void setBackgroundRow(boolean startBlack){
        boolean beginBlack;
        if(startBlack){
            beginBlack = true;
            for(AppCompatImageView celda : celdas){
                if(beginBlack) {
                    celda.setBackgroundColor(getResources().getColor(R.color.black));
                    beginBlack = false;
                }else {
                    celda.setBackgroundColor(getResources().getColor(R.color.white));
                    beginBlack = true;
                }
            }
        }else{
            beginBlack = false;
            for(AppCompatImageView celda : celdas){
                if(beginBlack) {
                    celda.setBackgroundColor(getResources().getColor(R.color.black));
                    beginBlack = false;
                }else {
                    celda.setBackgroundColor(getResources().getColor(R.color.white));
                    beginBlack = true;
                }
            }
        }
    }

    public int getId_colum(){
        return id_colum;
    }

    public void drawElement(int row,int res){
        celdas.get(row).setImageDrawable(getResources().getDrawable(res));
    }

    public void eraseElement(int row){
        celdas.get(row).setImageDrawable(null);
    }

    public void setOnRowListener(OnRowListener onRowListener){
        if(onRowListener!=null)
            this.onRowListener = onRowListener;
    }

    @Override
    public void onClick(View view) {
        for(int i=0;i<celdas.size();i++){
            if(view.equals(celdas.get(i))){
                onRowListener.onRowColumTouch(id_colum,i+1);
                return;
            }
        }
    }
}
