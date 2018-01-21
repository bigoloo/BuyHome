package com.bigoloo.finance.home.buyhome.views

import com.bigoloo.finance.home.domain.entity.Home


/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/20/18.
 */
interface RootView {


    fun showItems(homeList: List<Home>)

}
