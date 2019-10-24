package com.jobdemoapp.shared.di;

import androidx.lifecycle.ViewModel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import dagger.MapKey;

@MapKey
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewModelKey {
    Class<? extends ViewModel> value();
}
