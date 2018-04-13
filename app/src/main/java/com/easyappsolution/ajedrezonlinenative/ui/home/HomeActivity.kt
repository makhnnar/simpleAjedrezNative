package com.easyappsolution.ajedrezonlinenative.ui.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.easyappsolution.ajedrezonlinenative.R
import com.easyappsolution.ajedrezonlinenative.ui.views.interfaces.OnTableroListener
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity(), OnTableroListener {

    override fun onClickTablero(colum: Int, row: Int) {
        Log.i("Presionando"," ---> colum: "+colum+" row: "+row)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        this.tablero.setOnTableroListener(this)
        this.tablero.drawElement(1,3,R.drawable.test)
        this.tablero.drawElement(2,4,R.drawable.test)
        this.tablero.drawElement(4,5,R.drawable.test)
    }
}
