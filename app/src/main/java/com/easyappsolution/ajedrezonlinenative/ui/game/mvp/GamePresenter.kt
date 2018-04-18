package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.Player

/**
 * Created by makhnnar on 14/04/18.
 */
class GamePresenter(view:GameContract.View) : GameContract.Presenter, GameContract.ModelResultListener{

    lateinit var piezas : List<ChessPiece>

    lateinit var pieza : ChessPiece

    lateinit var player : Player

    var imMoving : Boolean = false

    override fun moveFicha(row: Int, colum: Int) {
        if(this.isOne(row,colum)){
            if(isMine(pieza)) {
                imMoving = true
            }
        }
    }

    override fun onMoveFichaSuccess() {

    }

    override fun onMoveFichaFailed() {

    }

    fun isOne(row: Int, colum: Int):Boolean{
        piezas.forEach {
            it ->
            if (it.row==row && it.colum==colum) {
                pieza = it
                return true
            }
        }
        return false
    }

    fun isMine(piece: ChessPiece): Boolean{
        if(piece.idPlayer==player.idPlayer)
            return true
        return false
    }

}