package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.interactors

import com.easyappsolution.ajedrezonlinenative.R
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessType
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ColorType
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract.RemoteResultListener
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.repositories.ServerGameRepository

/**
 * Created by makhnnar on 14/04/18.
 */
class GameRemoteInteractor(var listener: RemoteResultListener) : GameContract.RemoteInteractor {

    var repository : ServerGameRepository = ServerGameRepository(this)

    override fun onReciveMsg(msg: String) {
        listener.onMsjRecieve(msg)
    }

    fun initGame(){
        var pieces : ArrayList<ChessPiece> = ArrayList<ChessPiece>()
        pieces.add(ChessPiece(1,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,1,"1"))
        pieces.add(ChessPiece(2,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,2,"1"))
        pieces.add(ChessPiece(3,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,3,"1"))
        pieces.add(ChessPiece(4,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,4,"1"))
        pieces.add(ChessPiece(5,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,5,"1"))
        pieces.add(ChessPiece(6,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,6,"1"))
        pieces.add(ChessPiece(7,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,7,"1"))
        pieces.add(ChessPiece(8,8, R.drawable.test,ChessType.PEON,ColorType.BLANCA,8,"1"))
        listener.onLoadSuccessAllPieces(pieces)
    }

    fun makePlayAndValidate(colum:Int,row:Int,pieza:ChessPiece){
        //TODO: debo validar si es una jugada correcta antes de mandar al back
        listener.onMoveFichaSuccess(colum,row)
    }

    fun sendMsj(msj:String){
        repository.emit("my message",msj)
    }

}