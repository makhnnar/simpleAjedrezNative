package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.interactors

import com.easyappsolution.ajedrezonlinenative.R
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessType
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract.ModelResultListener
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.repositories.ServerGameRepository

/**
 * Created by makhnnar on 14/04/18.
 */
class GameRemoteInteractor(var listener: ModelResultListener) : GameContract.RemoteInteractor {

    var repository : ServerGameRepository = ServerGameRepository(this)

    override fun onReciveMsg(msg: String) {
        listener.onMsjRecieve(msg)
    }

    fun initGame(){
        var pieces : ArrayList<ChessPiece> = ArrayList<ChessPiece>()
        pieces.add(ChessPiece(1,1, R.drawable.test,ChessType.PEON,1,"1"))
        pieces.add(ChessPiece(1,2, R.drawable.test,ChessType.PEON,2,"1"))
        pieces.add(ChessPiece(1,3, R.drawable.test,ChessType.PEON,3,"1"))
        pieces.add(ChessPiece(1,4, R.drawable.test,ChessType.PEON,4,"1"))
        pieces.add(ChessPiece(1,5, R.drawable.test,ChessType.PEON,5,"1"))
        pieces.add(ChessPiece(1,6, R.drawable.test,ChessType.PEON,6,"1"))
        pieces.add(ChessPiece(1,7, R.drawable.test,ChessType.PEON,7,"1"))
        pieces.add(ChessPiece(1,8, R.drawable.test,ChessType.PEON,8,"1"))
        listener.onLoadSuccessAllPieces(pieces)
    }

    fun makePlayAndValidate(colum:Int,row:Int,pieza:ChessPiece){
        //TODO: debo validar si es una jugada correcta antes de mandar al back
        listener.onMoveFichaSuccess(colum,row)
    }

}