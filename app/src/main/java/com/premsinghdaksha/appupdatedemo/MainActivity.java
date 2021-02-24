package com.premsinghdaksha.appupdatedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import static com.premsinghdaksha.app_info.AppInfo.appRating;
import static com.premsinghdaksha.app_info.AppInfo.shareApp;
import static com.premsinghdaksha.app_info.AppInfo.updateversion;

public class MainActivity extends AppCompatActivity {
    private String sms = "Hi, Check out this revolutionary new App, Your App name! It is one of a kind app to register\n" +
            "and manage your products and its associated services of multiple brands. \n" +
            "~ You can also extend warranties or buy AMC \n";
    private String sms_update_version = "A new version of OneDios is available. Please update to V-1.2.3";
    String url = "https://play.google.com/store/apps/details?id=yourapplicationid";

    private Button upadte, share, rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rating = findViewById(R.id.rating);
        share = findViewById(R.id.share);
        upadte = findViewById(R.id.upadte);

        /* Rating on google playstore of ourApp */
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appRating(MainActivity.this);
            }
        });

        /* share application to another */
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareApp(MainActivity.this, sms, url);
            }
        });

        /* update app */
        upadte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateversion("version update", sms_update_version, url, MainActivity.this, "Yes", "No");
            }
        });


    }
}