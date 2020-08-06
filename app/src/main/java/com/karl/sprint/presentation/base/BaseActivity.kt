package com.karl.sprint.presentation.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

abstract class BaseActivity<VM : ViewModel> : AppCompatActivity() {

    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        initViewModel()
        initData()
        initView()
    }

    abstract fun getLayoutResId(): Int

    abstract fun initData()

    abstract fun initView()

    private fun initViewModel() {
        val clazz =
            this.javaClass.kotlin.supertypes[0].arguments[0].type!!.classifier!! as KClass<VM>
        //koin 注入
        viewModel = getViewModel<VM>(clazz)
    }
}