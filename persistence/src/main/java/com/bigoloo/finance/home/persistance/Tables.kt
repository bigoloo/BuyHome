package com.bigoloo.finance.home.persistance

import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.ForeignKey
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.rx2.structure.BaseRXModel

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */

@Table(database = AppDatabase::class)
class HomeDAO(@Column @PrimaryKey(autoincrement = true) var id: Int = 0,
              @Column var name: String,
              @Column var agency: String,
              @Column var timestamp: Long = -1,
              @Column var isVisit: Boolean = false,
              @Column var timeToVisit: Long = -1,
              @Column var isAvailable: Boolean = true,
              @Column var price: Long = 0,
              @Column var address: String?,
              @ForeignKey(
                      tableClass = LocationDAO::class,
                      saveForeignKeyModel = true) var location: LocationDAO? = null
/*              @OneToMany(methods = { OneToMany.Method.ALL }, variableName = "priceItems")

}*/

) : BaseRXModel()

@Table(database = AppDatabase::class)
class LocationDAO(
        @Column @PrimaryKey(autoincrement = true) var id: Int = 0,
        @Column var latitude: Double = 0.0,
        @Column var longitude: Double = 0.0
) : BaseRXModel()

@Table(database = AppDatabase::class)
class PriceDAO(
        @Column @PrimaryKey(autoincrement = true) var id: Int = 0,
        @Column var price: Long = 0,
        @Column var title: String?
) : BaseRXModel()