package com.easyappsolution.ajedrezonlinenative.ui.game.mvp

import com.easyappsolution.ajedrezonlinenative.ui.game.Models.ChessPiece
import com.easyappsolution.ajedrezonlinenative.ui.game.Models.Player

/**
 * Created by makhnnar on 14/04/18.
 */
class GamePresenter(var view:GameContract.View) : GameContract.Presenter, GameContract.ModelResultListener{

    lateinit var piezas : List<ChessPiece>

    var pos : Int = -1

    lateinit var player : Player

    var imMoving : Boolean = false

    var interactor : GameInteractor = GameInteractor()

    override fun moveFicha(colum:Int,row:Int) {
        if(this.isOne(colum,row)){
            if(this.isMine(piezas[pos])) {
                imMoving = true
            }else{
                imMoving = false
                pos = -1 //TODO posiblemente aca tenga un error de memoria. Revisar luego y modificar
            }
        }else{
            if(pos>-1){
                //Mandamos la posicion a la que queremos mandas
                //TODO: isMoving no sirve para nada aparentemente
                interactor.makePlayAndValidate(colum,row,this)
            }
        }
    }

    override fun onMoveFichaSuccess(colum:Int,row:Int) {
        //TODO desde aca actualizar la bandera de la movida
        view.onRemoveFicha(piezas[pos].colum,piezas[pos].row)
        piezas[pos].row = row
        piezas[pos].colum = colum
        view.onMoveFicha(colum,row,piezas[pos].res)
    }

    override fun onMoveFichaFailed() {

    }

    fun isOne(colum: Int,row: Int):Boolean{
        pos = 0
        piezas.forEach {
            it ->
            if (it.row==row && it.colum==colum) {
                return true
            }
            pos++
        }
        //TODO saldra por completo del metodo o solo del foreach????
        pos = -1
        return false
    }

    fun isMine(piece: ChessPiece?): Boolean{
        if(piece?.idPlayer==player.idPlayer)
            return true
        return false
    }

}