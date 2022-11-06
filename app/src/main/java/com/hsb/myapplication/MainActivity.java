package com.hsb.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends MyApp {
    LanguageManager languageManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageManager=new LanguageManager(MainActivity.this);
        TextView tt=findViewById(R.id.tt);
        tt.setOnClickListener(view -> {
            changeLanguage();
        });

    }
    private void changeLanguage() {
        final String[] language = {"English", "Urdu"};
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Choose Language");
        alertDialog.setSingleChoiceItems(language, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == 0) {

                    languageManager.updateResources("en");
                    recreate();
                }
                if (i == 1) {
                    languageManager.updateResources("ur");
                    recreate();
                }
            }
        });

        alertDialog.create();
        alertDialog.show();
    }
}