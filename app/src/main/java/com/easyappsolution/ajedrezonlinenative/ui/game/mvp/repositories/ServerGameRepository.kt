package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.repositories

import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.listeners.ConnectionListener
import io.socket.client.IO
import io.socket.client.Socket
import java.net.URISyntaxException

/**
 * Created by makhnnar on 27/04/18.
 */
class ServerGameRepository {

    var opts : IO.Options = IO.Options()
    lateinit var socket : Socket

    constructor(interactor: GameContract.RemoteInteractor){
        try {
            opts.forceNew = true
            opts.reconnection = true
            socket = IO.socket("http://localhost:8000",opts)
            socket.connect()
            socket.on(Socket.EVENT_CONNECT,ConnectionListener(interactor))
            socket.open()
        }catch (e : URISyntaxException){

        }
    }

    fun emit(evento:String,msg:String){
        try {
            socket.emit(evento, msg)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}