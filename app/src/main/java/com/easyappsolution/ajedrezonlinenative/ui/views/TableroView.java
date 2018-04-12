package com.easyappsolution.ajedrezonlinenative.ui.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.easyappsolution.ajedrezonlinenative.R;
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnRowListener;
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnTableroListener;

import java.util.ArrayList;

/**
 * Created by makhnnar on 07/04/18.
 */

public class TableroView extends ConstraintLayout implements OnRowListener{

    private OnTableroListener onTableroListener;

    ArrayList<TableroRowView> columnas = new ArrayList<>();

    public TableroView(Context context) {
        super(context);
        init(null,context);
    }

    private int prevRow;
    private int prevColum;

    public TableroView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs,context);
    }

    public TableroView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs,context);
    }

    private void init(@Nullable AttributeSet set, Context context){
        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.view_tablero, this, true);

        columnas.add((TableroRowView) findViewById(R.id.row_1));
        columnas.add((TableroRowView) findViewById(R.id.row_2));
        columnas.add((TableroRowView) findViewById(R.id.row_3));
        columnas.add((TableroRowView) findViewById(R.id.row_4));
        columnas.add((TableroRowView) findViewById(R.id.row_5));
        columnas.add((TableroRowView) findViewById(R.id.row_6));
        columnas.add((TableroRowView) findViewById(R.id.row_7));
        columnas.add((TableroRowView) findViewById(R.id.row_8));

        for(TableroRowView row : columnas){
            row.setOnRowListener(this);
        }


    }

    public void setOnTableroListener(OnTableroListener onTableroListener){
        if(onTableroListener!=null)
            this.onTableroListener = onTableroListener;
    }

    @Override
    public void onRowColumTouch(int colum,int row,boolean isOcupped) {
        onTableroListener.onClickTablero(colum,row,isOcupped);
    }

    @Override
    public void moveElement(int colum, int row, int res) {

    }

    @Override
    public int getElement(int colum, int row) {
        for(TableroRowView fila : columnas){
            if(fila.getId_colum()==colum){
                return fila.getResCelda(row);
            }
        }
        return -1;
    }
}
