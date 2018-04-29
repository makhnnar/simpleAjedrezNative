package com.easyappsolution.ajedrezonlinenative.ui.game.mvp.repositories

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.easyappsolution.ajedrezonlinenative.ui.utils.Values
import com.easyappsolution.ajedrezonlinenative.ui.utils.Values.DATABASE_NAME
import com.easyappsolution.ajedrezonlinenative.ui.utils.Values.DATABASE_VERSION
import java.security.AccessControlContext

/**
 * Created by makhnnar on 27/04/18.
 */
class DBGameRepository(var context: Context) : SQLiteOpenHelper(context,DATABASE_NAME,null, DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL("CREATE TABLE " + Values.PlayerEntry.TABLE_NAME + " ("
                + Values.PlayerEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Values.PlayerEntry.ID + " TEXT NOT NULL,"
                + Values.PlayerEntry.NAME + " TEXT NOT NULL,"
                + Values.PlayerEntry.SPECIALTY + " TEXT NOT NULL,"
                + Values.PlayerEntry.PHONE_NUMBER + " TEXT NOT NULL,"
                + Values.PlayerEntry.BIO + " TEXT NOT NULL,"
                + Values.PlayerEntry.AVATAR_URI + " TEXT,"
                + "UNIQUE (" + Values.PlayerEntry.ID + "))")

        db?.execSQL("CREATE TABLE " + Values.PieceEntry.TABLE_NAME + " ("
                + Values.PieceEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Values.PieceEntry.ID + " TEXT NOT NULL,"
                + Values.PieceEntry.RES + " TEXT NOT NULL,"
                + Values.PieceEntry.TYPE + " TEXT NOT NULL,"
                + Values.PieceEntry.COLOR + " TEXT NOT NULL,"
                + "UNIQUE (" + Values.PieceEntry.ID + "))")

        db?.execSQL("CREATE TABLE " + Values.PlayerPieceEntry.TABLE_NAME + " ("
                + Values.PlayerPieceEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Values.PlayerPieceEntry.ID + " TEXT NOT NULL,"
                + Values.PlayerPieceEntry.ID_PLAYER + " TEXT NOT NULL,"
                + Values.PlayerPieceEntry.ID_PIECE + " TEXT NOT NULL,"
                + Values.PlayerPieceEntry.ROW + " TEXT NOT NULL,"
                + Values.PlayerPieceEntry.COLUM + " TEXT NOT NULL,"
                + "UNIQUE (" + Values.PlayerPieceEntry.ID + "))")

        db?.execSQL("CREATE TABLE " + Values.GameEntry.TABLE_NAME + " ("
                + Values.GameEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Values.GameEntry.ID + " TEXT NOT NULL,"
                + Values.GameEntry.ID_PLAYER_1 + " TEXT NOT NULL,"
                + Values.GameEntry.ID_PLAYER_2 + " TEXT NOT NULL,"
                + "UNIQUE (" + Values.GameEntry.ID + "))")

        db?.execSQL("CREATE TABLE " + Values.MovementsGameEntry.TABLE_NAME + " ("
                + Values.MovementsGameEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + Values.MovementsGameEntry.ID + " TEXT NOT NULL,"
                + Values.MovementsGameEntry.ID_GAME + " TEXT NOT NULL,"
                + Values.MovementsGameEntry.ID_PLAYER_PIECE + " TEXT NOT NULL,"
                + Values.MovementsGameEntry.ROW + " TEXT NOT NULL,"
                + Values.MovementsGameEntry.COLUM + " TEXT NOT NULL,"
                + Values.MovementsGameEntry.TURN + " TEXT NOT NULL,"
                + "UNIQUE (" + Values.MovementsGameEntry.ID + "))")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }
}