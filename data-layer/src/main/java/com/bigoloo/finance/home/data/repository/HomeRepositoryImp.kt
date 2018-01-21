package com.bigoloo.finance.home.data.repository

import com.bigoloo.finance.home.data.mapper.mapToDao
import com.bigoloo.finance.home.data.mapper.mapToEntity
import com.bigoloo.finance.home.domain.entity.Home
import com.bigoloo.finance.home.domain.repository.HomeRepository
import com.bigoloo.finance.home.persistance.HomeDAO
import com.raizlabs.android.dbflow.config.DatabaseConfig
import com.raizlabs.android.dbflow.kotlinextensions.from
import com.raizlabs.android.dbflow.kotlinextensions.select
import com.raizlabs.android.dbflow.rx2.kotlinextensions.list
import com.raizlabs.android.dbflow.rx2.kotlinextensions.rx
import io.reactivex.Completable
import io.reactivex.Single

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */


class HomeRepositoryImp : HomeRepository {
    override fun saveHome(home: Home?): Single<Boolean> {


        val mapToDao = home?.mapToDao()
        return if (mapToDao != null) {
            mapToDao.save().map({

                return@map it
            })

        } else {
            Single.just(false)
        }
    }


    override fun getAll(): Single<List<Home>> {

        return (select from HomeDAO::class).rx().list.map {

            return@map it.mapTo(ArrayList()) {
                return@mapTo it.mapToEntity()
            }
        }
    }


}