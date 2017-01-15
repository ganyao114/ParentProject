package net.swiftos.common.application;

import android.app.Application;

import net.swiftos.common.di.component.AppComponent;
import net.swiftos.common.di.component.DaggerAppComponent;
import net.swiftos.common.di.module.AppModule;

/**
 * Created by gy939 on 2017/1/11.
 */

public class BaseApplication extends Application {

    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    private static BaseApplication application;

    public static BaseApplication getApplication() {
        return application;
    }

    private void init() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
