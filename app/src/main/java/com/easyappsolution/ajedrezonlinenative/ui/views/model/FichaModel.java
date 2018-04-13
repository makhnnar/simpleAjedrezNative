package com.easyappsolution.ajedrezonlinenative.ui.views.model;

/**
 * Created by makhnnar on 13/04/18.
 */

public class FichaModel {

    private int row;
    private int colum;
    private int res;
    private boolean isInGame;


    public FichaModel(int row, int colum, int res) {
        this.row = row;
        this.colum = colum;
        this.res = res;
        isInGame = true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public boolean isInGame() {
        return isInGame;
    }

    public void changeInGame() {
        isInGame = !isInGame;
    }
}
