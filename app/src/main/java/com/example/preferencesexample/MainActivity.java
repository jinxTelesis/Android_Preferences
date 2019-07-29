package com.example.preferencesexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

public class MainActivity extends AppCompatActivity {

    static {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
    }

    @Override
    protected void onCreate(Bundle savedIstanceState){
        super.onCreate(savedIstanceState);
        setContentView(R.layout.activity_main);

        Fragment SettingsFragment = new SettingsFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.pref_container,SettingsFragment);


//        if(savedIstanceState == null){
//            Fragment SettingsFragment = new SettingsFragment();
//            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//            ft.add(R.id.pref_container,SettingsFragment);
//        }

    }
}
