package com.example.tp_cycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo,logo3,logo4,logo5,logo6,logo7,logo8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //to hide the bar in the activity
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //

    logo = findViewById(R.id.logo);
    logo.animate().rotation(360f).setDuration(2000);
    logo.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
    logo.animate().translationYBy(1000f).setDuration(2000);
    logo.animate().alpha(0f).setDuration(6000);

        logo3 = findViewById(R.id.logo3);
        logo3.animate().rotation(360f).setDuration(2000);
        logo3.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo3.animate().translationYBy(1000f).setDuration(2000);
        logo3.animate().alpha(0f).setDuration(6000);
        logo4= findViewById(R.id.logo4);
        logo4.animate().rotation(360f).setDuration(2000);
        logo4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo4.animate().translationYBy(1000f).setDuration(2000);
        logo4.animate().alpha(0f).setDuration(6000);
        logo5 = findViewById(R.id.logo5);
        logo5.animate().rotation(360f).setDuration(2000);
        logo5.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo5.animate().translationYBy(1000f).setDuration(2000);
        logo5.animate().alpha(0f).setDuration(6000);
        logo6 = findViewById(R.id.logo6);
        logo6.animate().rotation(360f).setDuration(2000);
        logo6.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo6.animate().translationYBy(1000f).setDuration(2000);
        logo6.animate().alpha(0f).setDuration(6000);
        logo7 = findViewById(R.id.logo7);
        logo7.animate().rotation(360f).setDuration(2000);
        logo7.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo7.animate().translationYBy(1000f).setDuration(2000);
        logo7.animate().alpha(0f).setDuration(6000);
        logo8 = findViewById(R.id.logo8);
        logo8.animate().rotation(360f).setDuration(2000);
        logo8.animate().scaleX(0.5f).scaleY(0.5f).setDuration(3000);
        logo8.animate().translationYBy(1000f).setDuration(2000);
        logo8.animate().alpha(0f).setDuration(6000);

    Thread t = new Thread() {
        @Override
    public void run()
    {
        try
    { sleep(5000);
        Intent intent = new Intent(SplashActivity.this, ListActivity.class);
        startActivity(intent);
    }
        catch (InterruptedException e)
        { e.printStackTrace();
        } } };
    t.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        this.finish();
    }
}
