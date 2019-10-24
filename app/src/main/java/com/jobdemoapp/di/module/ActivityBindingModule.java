package com.jobdemoapp.di.module;

import com.jobdemoapp.shared.di.ActivityScoped;
import com.jobdemoapp.ui.MainActivity;
import com.jobdemoapp.ui.MainActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = {
            MainActivityModule.class})
    abstract MainActivity mainActivity();
}
