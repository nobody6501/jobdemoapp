package com.jobdemoapp.di.component;

import com.jobdemoapp.MainApplication;
import com.jobdemoapp.di.module.ActivityBindingModule;
import com.jobdemoapp.di.module.AppModule;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
            AndroidSupportInjectionModule.class,
            AppModule.class,
        }
)
public interface AppComponent extends AndroidInjector<MainApplication> {

    @Component.Factory
    interface Factory {
        AppComponent create(@BindsInstance MainApplication application);
    }
//    interface Factory extends AndroidInjector.Factory<MainApplication> {}
}
