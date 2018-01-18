package com.bigoloo.finance.home.persistance

/*
import android.content.Context
import com.raizlabs.android.dbflow.config.DatabaseConfig
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager
import org.junit.After
import org.junit.Before

*/
/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 *//*

abstract class DatabaseTest {
    protected lateinit var context: Context


    @Before
    fun setUp() {
        context = InstrumentationRegistry.getTargetContext()
        FlowManager.init(FlowConfig.builder(context)
                .addDatabaseConfig(DatabaseConfig.builder(AppDatabase::class.java)
                        .databaseName(AppDatabase.DB_NAME)
                        .build())
                .build())
    }

    @After
    fun tearDown() {
        context.deleteDatabase("${AppDatabase.DB_NAME}.db")
        FlowManager.destroy()
    }

}*/
