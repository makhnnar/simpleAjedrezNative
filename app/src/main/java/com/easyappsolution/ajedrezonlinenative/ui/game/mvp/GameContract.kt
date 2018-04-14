package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

/**
 * Created by makhnnar on 14/04/18.
 */
class GameContract {

    interface View{

        fun onRemoveFicha(row:Int,colum:Int)
        fun onMoveFicha(row:Int,colum:Int)

    }

    interface Presenter{

        fun moveFicha(row:Int,colum:Int)

    }

    interface ModelResultListener{

        fun onMoveFichaSuccess()
        fun onMoveFichaFailed()

    }

}