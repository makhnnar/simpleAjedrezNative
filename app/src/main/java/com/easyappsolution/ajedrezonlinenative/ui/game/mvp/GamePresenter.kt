package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece

/**
 * Created by makhnnar on 14/04/18.
 */
class GamePresenter(view:GameContract.View) : GameContract.Presenter, GameContract.ModelResultListener{

    lateinit var piezas : List<ChessPiece>

    override fun moveFicha(row: Int, colum: Int) {

    }

    override fun onMoveFichaSuccess() {

    }

    override fun onMoveFichaFailed() {

    }

}