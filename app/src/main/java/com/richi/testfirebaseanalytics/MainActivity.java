package com.richi.testfirebaseanalytics;

import android.content.ComponentName;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.btnMyBox1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseOptions options = new FirebaseOptions.Builder()
//                        .setApplicationId("1:881835738524:android:faca0b5e10e211e8")
//                        .setApiKey("AIzaSyBGQKuy0kav7VGSRLDK5ZMzjjJyQDxfoNo")
//                        .setDatabaseUrl("test")
//                        .build();
//
////                FirebaseAnalytics.getInstance(MainActivity.this.getApplicationContext()).de
//                FirebaseApp.initializeApp(MainActivity.this.getApplicationContext(), options);
//            }
//        });

//        findViewById(R.id.btnMyBox2).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseOptions options = new FirebaseOptions.Builder()
//                        .setApplicationId("1:217007617222:android:faca0b5e10e211e8")
//                        .setApiKey("AIzaSyB3uiu6NCpxn9KjeGvFdKCblXdE-aokW0o")
//                        .setDatabaseUrl("test")
//                        .build();
//
//                FirebaseApp.initializeApp(MainActivity.this.getApplicationContext(), options);
////                FirebaseApp.getInstance().
//            }
//        });

        findViewById(R.id.btnLog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAnalytics.getInstance(MainActivity.this).logEvent("ScreenName", new Bundle());
            }
        });
    }
}
