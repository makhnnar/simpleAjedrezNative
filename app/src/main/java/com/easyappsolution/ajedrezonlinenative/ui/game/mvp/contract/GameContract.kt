package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract

import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece

/**
 * Created by makhnnar on 14/04/18.
 */
class GameContract {

    interface View{

        fun onRemoveFicha(colum:Int,row:Int)
        fun onMoveFicha(colum:Int,row:Int,res:Int)
        fun onShowAllPieces(pieces : List<ChessPiece>)
        fun onCloseGameSession()

        fun onMsjRecieve(msj:String)

    }

    interface Presenter{

        fun moveFicha(colum:Int,row:Int)
        fun initGame()

        fun sendMessage(msj:String)

    }

    interface LocalInteractor{

        fun moveFicha(colum:Int,row:Int)
        fun initGame()

    }

    interface RemoteInteractor{

        fun onReciveMsg(msg:String)

    }

    interface ModelResultListener{

        fun onMoveFichaSuccess(colum:Int,row:Int)
        fun onMoveFichaFailed()
        fun onLoadSuccessAllPieces(pieces : List<ChessPiece>)
        fun onLoadFailedAllPieces()

        fun onMsjRecieve(msj:String)

    }

}