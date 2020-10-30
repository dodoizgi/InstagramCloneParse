package com.dodo.instagramcloneparse;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {


    @Override
    public void onCreate() {

        super.onCreate();
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("lEXkEtRI828lWbAeMHxwqOpXcimfEvwtr9t1zZJV")
        .clientKey("ws0cop6fTDd2wqsUxRU6EuoltwcZ0SQuZfbNjKIJ")
        .server("https://parseapi.back4app.com/")
        .build());

    }
}
