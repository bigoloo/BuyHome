package com.bigoloo.finance.home.data.mapper

import com.bigoloo.finance.home.domain.entity.Home
import com.bigoloo.finance.home.persistance.HomeDAO

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/18/18.
 */
internal fun Home.mapToDao(): HomeDAO {

    return HomeDAO(name = name, address = address, agency = agency,
            timestamp = System.currentTimeMillis(),
            timeToVisit = timeToVisit, isAvailable = isAvailable, isVisit = isVisit)

}

internal fun HomeDAO.mapToEntity(): Home {

    return Home(id = id, name = name, isVisit = isVisit,
            isAvailable = isAvailable, address = address, agency = agency)
}