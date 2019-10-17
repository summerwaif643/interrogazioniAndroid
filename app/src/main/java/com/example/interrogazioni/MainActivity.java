package com.example.interrogazioni;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] arrayInterrogati = new int[19];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generate(View view) {
        Random interrogato = new Random();
        TextView nInterrogato = (TextView) findViewById(R.id.numberToInterrogate);
        SharedPreferences prefs = getSharedPreferences("com.example.", MODE_PRIVATE);

        int n = 0;
        String stringN;
        n = interrogato.nextInt(19) + 1;

        stringN = Integer.toString(n);
        nInterrogato.setText(stringN);


        /*
        public void incrementa(View view) {
        SharedPreferences prefs;
        prefs = getSharedPreferences("com.example.schoolprojects", MODE_PRIVATE);

        TextView add = (TextView) findViewById(R.id.show_count);

        int clicks = (prefs.getInt("contatore", 0)) + 1;
        prefs.edit().putInt("contatore", clicks).apply();

        String stringClicks = Integer.toString(clicks);
        add.setText(stringClicks);

    }

         */

        interrogato.nextInt(19);


    }
}
