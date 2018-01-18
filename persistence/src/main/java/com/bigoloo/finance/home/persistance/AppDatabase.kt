package com.bigoloo.finance.home.persistance

import com.raizlabs.android.dbflow.annotation.Database

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */


@Database(name = AppDatabase.DB_NAME, version = AppDatabase.VERSION)
class AppDatabase {

    companion object {
        const val DB_NAME = "app-db"
        const val VERSION = 1
    }

}