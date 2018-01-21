package com.bigoloo.finance.home.buyhome

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bigoloo.finance.home.buyhome.presenters.RootPresenter
import com.bigoloo.finance.home.buyhome.views.RootView
import com.bigoloo.finance.home.domain.entity.Home


class MainActivity : AppCompatActivity(), RootView {
    override fun showItems(homeList: List<Home>) {


    }

    lateinit var presenter: RootPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onViewAttached(this)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStop() {
        super.onStop()

        presenter.onViewDetached()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroyed()
    }
}
