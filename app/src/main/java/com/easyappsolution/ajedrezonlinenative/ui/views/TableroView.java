package com.easyappsolution.ajedrezonlinenative.ui.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;

import com.easyappsolution.ajedrezonlinenative.R;
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnRowListener;

/**
 * Created by makhnnar on 07/04/18.
 */

public class TableroView extends ConstraintLayout implements OnRowListener{

    private TableroRowView row1;
    private TableroRowView row2;
    private TableroRowView row3;
    private TableroRowView row4;
    private TableroRowView row5;
    private TableroRowView row6;
    private TableroRowView row7;
    private TableroRowView row8;

    public TableroView(Context context) {
        super(context);
        init(null,context);
    }

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
        row1 = (TableroRowView) findViewById(R.id.row_1);
        row2 = (TableroRowView) findViewById(R.id.row_2);
        row3 = (TableroRowView) findViewById(R.id.row_3);
        row4 = (TableroRowView) findViewById(R.id.row_4);
        row5 = (TableroRowView) findViewById(R.id.row_5);
        row6 = (TableroRowView) findViewById(R.id.row_6);
        row7 = (TableroRowView) findViewById(R.id.row_7);
        row8 = (TableroRowView) findViewById(R.id.row_8);

        row1.setOnRowListener(this);
        row2.setOnRowListener(this);
        row3.setOnRowListener(this);
        row4.setOnRowListener(this);
        row5.setOnRowListener(this);
        row6.setOnRowListener(this);
        row7.setOnRowListener(this);
        row8.setOnRowListener(this);

    }

    @Override
    public void onRowTouch(int row) {
        Log.i("ID"," ---> "+row);
    }
}
