package com.karl.sprint.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

abstract class BaseFragment<VM : ViewModel> : Fragment() {

    lateinit var viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutResId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
        initData()
        initView()
    }

    private fun initViewModel() {
        val clazz =
            this.javaClass.kotlin.supertypes[0].arguments[0].type!!.classifier!! as KClass<VM>
        viewModel = getViewModel<VM>(clazz) //koin 注入
    }

    abstract fun getLayoutResId(): Int

    abstract fun initData()

    abstract fun initView()
}