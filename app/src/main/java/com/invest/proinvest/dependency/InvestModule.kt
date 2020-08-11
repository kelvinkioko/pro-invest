package com.invest.proinvest.dependency

import com.invest.proinvest.data.repository.LessonRepository
import com.invest.proinvest.data.repository.TopicsRepository
import com.invest.proinvest.ui.home.HomeViewModel
import com.invest.proinvest.ui.lessons.LessonViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val InvestModule = module {
    single { TopicsRepository(get()) }
    single { LessonRepository(get()) }
    viewModel { HomeViewModel(repository = get()) }
    viewModel { LessonViewModel(repository = get()) }
    single { Dispatchers.IO }
}
