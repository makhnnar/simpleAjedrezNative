package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.repositories

import android.util.Log
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.contract.GameContract
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.listeners.ConnectionListener
import com.easyappsolution.ajedrezonlinenative.ui.game.mvp.listeners.MessagesListener
import io.socket.client.IO
import io.socket.client.Socket
import java.net.URISyntaxException

/**
 * Created by makhnnar on 27/04/18.
 */
class ServerGameRepository {

    var opts : IO.Options = IO.Options()
    lateinit var socket : Socket
    var dir:String = "http://192.168.0.100:8000"

    constructor(interactor: GameContract.RemoteInteractor){
        try {
            opts.forceNew = true
            opts.reconnection = true
            socket = IO.socket(dir,opts)
            Log.i("INSTANCIANDO","---> Conectando en "+dir)
            socket.connect()
            socket.on(Socket.EVENT_CONNECT,ConnectionListener(interactor))
            socket.on("my message",MessagesListener(interactor))
            socket.open()
        }catch (e : URISyntaxException){
            Log.i("ENVIANDO","---> excepcion: "+e.message)
        }
    }

    fun emit(evento:String,msg:String){
        try {
            Log.i("ENVIANDO","---> msg: "+msg+" evento: "+evento)
            socket.emit(evento, msg)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}