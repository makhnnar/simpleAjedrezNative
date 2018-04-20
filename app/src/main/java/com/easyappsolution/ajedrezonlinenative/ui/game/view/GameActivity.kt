package com.easyappsolution.ajedrezonlinenative.ui.game.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.easyappsolution.ajedrezonlinenative.R
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.GameContract.View
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.GamePresenter
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnTableroListener
import kotlinx.android.synthetic.main.activity_home.*

class GameActivity : AppCompatActivity(), View, OnTableroListener {

    lateinit var gamePresenter : GamePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        gamePresenter = GamePresenter(this)
    }

    override fun onRemoveFicha(colum:Int,row:Int) {
        this.tablero.eraseElement(colum,row)
    }

    override fun onMoveFicha(colum:Int,row:Int,res:Int) {
        this.tablero.drawElement(colum,row,res)
    }

    override fun onClickTablero(colum: Int, row: Int) {
        gamePresenter.moveFicha(colum,row)
    }
}
