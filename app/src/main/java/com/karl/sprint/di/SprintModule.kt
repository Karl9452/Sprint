package com.karl.sprint.di

import com.google.gson.GsonBuilder
import com.karl.sprint.data.net.RetrofitClient
import com.karl.sprint.presentation.find.FindViewModel
import com.karl.sprint.presentation.home.HomeViewModel
import com.karl.sprint.presentation.main.MainViewModel
import com.karl.sprint.presentation.mine.MineViewModel
import com.karl.sprint.presentation.video.VideoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val commonModule = module {
    single {
        RetrofitClient.instance
    }

    single {
        GsonBuilder().disableHtmlEscaping().create()
    }
}

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
    viewModel { VideoViewModel() }
    viewModel { FindViewModel() }
    viewModel { MineViewModel() }
}

val repoModule = module {

}

val sprintModule = listOf(
    commonModule, viewModelModule
)