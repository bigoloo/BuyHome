package com.bigoloo.finance.home.buyhome

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import butterknife.BindView
import com.bigoloo.finance.home.buyhome.presenters.AddPresenter
import com.bigoloo.finance.home.buyhome.views.AddView
import com.bigoloo.finance.home.domain.entity.Home

class AddHomeActivity : AppCompatActivity(), AddView {
    override fun showFailure() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var presenter: AddPresenter


    @BindView(R.id.save_home)
    lateinit var saveBtn: Button

    @BindView(R.id.price_tv)
    lateinit var priceBtn: Button

    @BindView(R.id.name_tv)
    lateinit var nameBtn: Button


    @BindView(R.id.address_tv)
    lateinit var addressBtn: Button


    @BindView(R.id.agency_tv)
    lateinit var agencyBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_home)

        saveBtn.setOnClickListener({ v ->


            var home = Home(address = addressBtn.text.toString(), name = nameBtn.text.toString(),
                    price = priceBtn.text.toString().toLong(), agency = agencyBtn.text.toString())

            presenter.saveHome(home)

        })
    }

    override fun onStart() {
        super.onStart()

        presenter.onViewAttached(this)
    }

    override fun onResume() {
        super.onResume()
        presenter.onViewAttached(this)

    }

}




