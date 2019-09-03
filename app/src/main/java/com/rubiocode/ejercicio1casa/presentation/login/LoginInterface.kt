package com.rubiocode.ejercicio1casa.presentation.login

interface LoginInterface {
    interface View{
        fun showError(msgError:String)
        fun showProgressBar()
        fun hideProgressBar()
        fun signIn()
    }
}