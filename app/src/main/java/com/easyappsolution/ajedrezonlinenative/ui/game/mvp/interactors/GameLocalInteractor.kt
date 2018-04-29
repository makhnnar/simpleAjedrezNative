package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.interactors

import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract.LocalInteractor
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract.LocalResultListener

/**
 * Created by makhnnar on 27/04/18.
 */
class GameLocalInteractor(var listener : LocalResultListener) : LocalInteractor{

    override fun foundIt(colum: Int, row: Int) {
        //TODO: aplicar la logica de base de datos para encontrar un valor y saber si corresponde
        if(true){
            //listener.onFoundSuccess(ChessPiece())
        }else{
            //listener.onFoundFailed()
        }
    }

}