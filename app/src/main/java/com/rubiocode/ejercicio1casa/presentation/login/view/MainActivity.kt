package com.rubiocode.ejercicio1casa.presentation.login.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.rubiocode.ejercicio1casa.R
import com.rubiocode.ejercicio1casa.base.BaseActivity
import com.rubiocode.ejercicio1casa.presentation.login.LoginInterface
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), LoginInterface.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BtIngresar.setOnClickListener {
            signIn()
        }
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun showError(msgError: String) {
        Toast.makeText(this,msgError,Toast.LENGTH_SHORT).show()
    }

    override fun showProgressBar() {
        progressBar_.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar_.visibility = View.GONE
    }

    override fun signIn() {
        Toast.makeText(this, "Ingresando", Toast.LENGTH_SHORT).show()
    }

}
