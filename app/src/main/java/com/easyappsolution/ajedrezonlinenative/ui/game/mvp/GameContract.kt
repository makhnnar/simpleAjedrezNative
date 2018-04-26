package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

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

    }

    interface Presenter{

        fun moveFicha(colum:Int,row:Int)
        fun initGame()

    }

    interface ModelResultListener{

        fun onMoveFichaSuccess(colum:Int,row:Int)
        fun onMoveFichaFailed()
        fun onLoadSuccessAllPieces(pieces : List<ChessPiece>)
        fun onLoadFailedAllPieces()

    }

}