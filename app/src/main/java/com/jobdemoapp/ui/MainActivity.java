package com.jobdemoapp.ui;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.jobdemoapp.R;
import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
//    @Inject
//    SharedPreferences sharedPreferences;
    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        AndroidInjection.inject(this);
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainActivityViewModel.class);
        setContentView(R.layout.activity_main);
    }
}
