package com.bigoloo.finance.home.domain.repository

import com.bigoloo.finance.home.domain.entity.Home
import io.reactivex.Completable
import io.reactivex.Single

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */


interface HomeRepository {

    fun getAll(): Single<List<Home>>
    fun save(home: Home): Completable
}