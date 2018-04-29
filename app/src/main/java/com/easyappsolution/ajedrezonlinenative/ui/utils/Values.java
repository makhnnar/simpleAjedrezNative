package com.easyappsolution.ajedrezonlinenative.ui.utils;

import android.provider.BaseColumns;

/**
 * Created by makhnnar on 29/04/18.
 */

public class Values {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "game.db";

    public static abstract class PlayerEntry implements BaseColumns {
        public static final String TABLE_NAME ="player";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String SPECIALTY = "specialty";
        public static final String PHONE_NUMBER = "phoneNumber";
        public static final String AVATAR_URI = "avatarUri";
        public static final String BIO = "bio";
    }

    public static abstract class PieceEntry implements BaseColumns {
        public static final String TABLE_NAME ="piece";
        public static final String ID = "id";
        public static final String RES = "res";
        public static final String TYPE = "type";
        public static final String COLOR = "color";
    }

    public static abstract class PlayerPieceEntry implements BaseColumns {
        public static final String TABLE_NAME ="player_piece";
        public static final String ID = "id";
        public static final String ID_PLAYER = "id_player";
        public static final String ID_PIECE = "id_piece";
        public static final String ROW = "row";
        public static final String COLUM = "colum";
        public static final String ON_GAME = "on_game";
    }

    public static abstract class GameEntry implements BaseColumns {
        public static final String TABLE_NAME ="game";
        public static final String ID = "id";
        public static final String ID_PLAYER_1= "id_player_1";
        public static final String ID_PLAYER_2 = "id_player_2";
    }

    public static abstract class MovementsGameEntry implements BaseColumns {
        public static final String TABLE_NAME ="game_movements";
        public static final String ID = "id";
        public static final String ID_GAME = "id_game";
        public static final String ID_PLAYER_PIECE = "id_player_piece";
        public static final String ROW = "row";
        public static final String COLUM = "colum";
        public static final String TURN = "turn";
    }

}
