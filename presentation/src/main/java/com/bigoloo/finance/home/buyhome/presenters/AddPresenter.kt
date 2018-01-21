package com.bigoloo.finance.home.buyhome.presenters

import android.annotation.SuppressLint
import com.bigoloo.finance.home.buyhome.views.AddView
import com.bigoloo.finance.home.domain.entity.Home
import com.bigoloo.finance.home.domain.intractor.AddHome
import javax.inject.Inject

/**
 * Created by Amin Bahiraei (mr.bahiraee@gmail.com) at  1/21/18.
 */


class AddPresenter @Inject constructor(val addHomeUseCase: AddHome) : BasePresenter<AddView>() {


    @SuppressLint("RxLeakedSubscription")
    fun saveHome(home: Home) {

        addHomeUseCase.execute(home).subscribe({
            view?.showSuccess()
        }, {
            view?.showFailure()
        })
    }


}