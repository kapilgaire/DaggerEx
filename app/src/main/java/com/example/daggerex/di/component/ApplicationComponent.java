package com.example.daggerex.di.component;

import android.app.Application;
import android.content.Context;

import com.example.daggerex.DaggerEx;
import com.example.daggerex.data.DataManager;
import com.example.daggerex.data.DbHelper;
import com.example.daggerex.data.SharedPrefsHelper;
import com.example.daggerex.di.ApplicationContext;
import com.example.daggerex.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(DaggerEx demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();
}
