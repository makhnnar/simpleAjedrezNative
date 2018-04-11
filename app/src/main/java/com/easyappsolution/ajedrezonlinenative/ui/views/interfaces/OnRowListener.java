package com.easyappsolution.ajedrezonlinenative.ui.views.interfaces;

/**
 * Created by makhnnar on 10/04/18.
 */

public interface OnRowListener {

    void onRowColumTouch( int colum, int row, boolean isOcupped);
    void moveElement(int colum, int row,int res);
    int getElement(int colum, int row);

}
