package com.example.daggerex;

import android.app.Application;
import android.content.Context;

import com.example.daggerex.data.DataManager;
import com.example.daggerex.di.component.ApplicationComponent;
import com.example.daggerex.di.module.ApplicationModule;

import javax.inject.Inject;

public class DaggerEx extends Application {
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DaggerEx get(Context context) {
        return (DaggerEx) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }
    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
