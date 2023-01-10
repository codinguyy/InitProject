package app.codinguyy.initproject.di

import app.codinguyy.initproject.repository.Repository
import app.codinguyy.initproject.services.RetrofitBuilder
import app.codinguyy.initproject.ui.firstfragment.FirstFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel { FirstFragmentViewModel(get()) }
}

val repositories = module {
    single { Repository(get()) }
    single { RetrofitBuilder() }
}