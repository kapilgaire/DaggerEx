package com.example.daggerex.di.component;

import com.example.daggerex.MainActivity;
import com.example.daggerex.di.PerActivity;
import com.example.daggerex.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

}
