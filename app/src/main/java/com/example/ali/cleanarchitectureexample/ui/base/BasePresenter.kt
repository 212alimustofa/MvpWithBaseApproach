package com.example.ali.cleanarchitectureexample.ui.base

/**
 * Created by ali on 06/10/17.
 */
interface BasePresenter<V: BaseView>{
    fun onAttach(view: V)
    fun onDetach()
}