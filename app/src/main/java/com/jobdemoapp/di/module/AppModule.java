package com.jobdemoapp.di.module;

import android.content.Context;

import com.jobdemoapp.MainApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    Context provideContext(MainApplication application) {
        return application;
    }

}


