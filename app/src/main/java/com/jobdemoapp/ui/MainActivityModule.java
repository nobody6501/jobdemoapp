package com.jobdemoapp.ui;

import androidx.lifecycle.ViewModel;

import com.jobdemoapp.shared.di.ViewModelKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel.class)
    abstract ViewModel bindViewModel(MainActivityViewModel viewModel);

}
