package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.listeners

import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract
import io.socket.emitter.Emitter

/**
 * Created by makhnnar on 27/04/18.
 */
class ConnectionListener(var interactor: GameContract.RemoteInteractor) : Emitter.Listener {

    override fun call(vararg p0: Any?) {
        try {
            var msj : String  = p0[0].toString()
            interactor.onReciveMsg(msj)
        }catch (e:Exception){

        }
    }
}