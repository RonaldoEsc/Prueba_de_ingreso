package com.hrec.pruebadeingreso.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBase(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    override fun onCreate(p0: SQLiteDatabase?) {
        val table = ("CREATE TABLE " +
                TABLE_NAME + "(" +
                COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_NAME + " TEXT," +
                COLUMN_EMAIL + " TEXT," +
                COLUMN_PHONE + " TEXT," +
                COLUMN_WEBSITE + " TEXT" +
                ")")
        p0?.execSQL(table)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(p0)
    }

    companion object {
        const val DATABASE_NAME = "Users"
        const val DATABASE_VERSION = 1

        const val TABLE_NAME = "USERS"
        const val COLUMN_ID = "ID"
        const val COLUMN_NAME = "NAME"
        const val COLUMN_EMAIL = "EMAIL"
        const val COLUMN_PHONE = "PHONE"
        const val COLUMN_WEBSITE = "WEBSITE"
    }
}