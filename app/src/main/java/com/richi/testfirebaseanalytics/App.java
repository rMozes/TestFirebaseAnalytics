package com.richi.testfirebaseanalytics;

import android.app.Application;
import android.util.Log;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/**
 * Created by
 * rMozes on 8/7/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setApplicationId("1:217007617222:android:faca0b5e10e211e8")
                .setDatabaseUrl("https://testmybox2.firebaseio.com")
                .setGcmSenderId("217007617222")
                .setApiKey("AIzaSyA_Fp-6TgkwT9f8bDDTsTQLJUfP9IwqxPk")
                .setStorageBucket("testmybox2.appspot.com")
                .build();

        FirebaseApp.initializeApp(getApplicationContext(), options);

        for (FirebaseApp firebaseApp : FirebaseApp.getApps(this)) {
            Log.d("FirebaseAnalytic", "AppName: " + firebaseApp.getName() + "Google app id: " + firebaseApp.getOptions().getApplicationId());
        }
    }
}
