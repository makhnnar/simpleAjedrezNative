package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

/**
 * Created by makhnnar on 14/04/18.
 */
class GameInteractor {

    fun makePlayAndValidate(colum:Int,row:Int,listener: GameContract.ModelResultListener){
        //TODO: debo validar si es una jugada correcta antes de mandar al back
        listener.onMoveFichaSuccess(colum,row)
    }

}