package com.easyappsolution.ajedrezonlinenative.ui.game.Models

import com.easyappsolution.ajedrezonlinenative.ui.views.model.FichaModel

/**
 * Created by makhnnar on 14/04/18.
 */
class ChessPiece(row:Int,
                 colum:Int,
                 res:Int,
                 val type:ChessType,
                 val color:ColorType,
                 val idPiece:Int,
                 val idPlayer:String)
    : FichaModel(row,colum,res) {

}