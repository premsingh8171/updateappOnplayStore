package com.premsinghdaksha.appupdatedemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static com.premsinghdaksha.app_info.AppInfo.shareApp;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String sms = "Hi, Check out this revolutionary new App, Your App name! It is one of a kind app to register\n" +
                "and manage your products and its associated services of multiple brands. \n" +
                "~ You can also extend warranties or buy AMC \n";
        shareApp(MainActivity.this, "Hello application", "");
    }
}