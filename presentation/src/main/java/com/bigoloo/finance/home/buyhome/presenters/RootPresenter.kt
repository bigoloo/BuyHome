package com.bigoloo.finance.home.buyhome.presenters

import android.annotation.SuppressLint
import android.util.Log
import com.bigoloo.finance.home.buyhome.views.RootView
import com.bigoloo.finance.home.domain.intractor.GetHomeData
import javax.inject.Inject

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/20/18.
 */


class RootPresenter @Inject constructor(val homeUseCase: GetHomeData) : BasePresenter<RootView>() {


    @SuppressLint("RxLeakedSubscription")
    fun loadHomes() {
        homeUseCase.execute(null).subscribe({ homes ->

            view?.showItems(homes)
        }, {
            Log.e("we fucked !!!", "fucked a lot !!!")
        }
        )
    }


}

