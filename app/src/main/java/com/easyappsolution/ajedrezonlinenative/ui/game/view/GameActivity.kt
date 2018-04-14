package com.easyappsolution.ajedrezonlinenative.ui.game.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.easyappsolution.ajedrezonlinenative.R
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.GameContract.View

class GameActivity : AppCompatActivity(), View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    override fun onRemoveFicha(row:Int,colum:Int) {

    }

    override fun onMoveFicha(row:Int,colum:Int) {

    }
}
