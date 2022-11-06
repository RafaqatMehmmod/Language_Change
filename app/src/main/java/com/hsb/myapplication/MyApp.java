package com.hsb.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyApp extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LanguageManager languageManager=new LanguageManager(MyApp.this);
        languageManager.updateResources(languageManager.getLanguage());
    }
}
