package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

/**
 * Created by makhnnar on 14/04/18.
 */
class GameContract {

    interface View{

        fun onRemoveFicha(colum:Int,row:Int)
        fun onMoveFicha(colum:Int,row:Int,res:Int)

    }

    interface Presenter{

        fun moveFicha(colum:Int,row:Int)

    }

    interface ModelResultListener{

        fun onMoveFichaSuccess(colum:Int,row:Int)
        fun onMoveFichaFailed()

    }

}