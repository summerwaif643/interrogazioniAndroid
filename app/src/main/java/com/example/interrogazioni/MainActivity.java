package com.example.interrogazioni;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.interrogazioni.RandomJSONRPC.src.org.random.api.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] arrayInterrogati = new int[19];
    public String apiKey = "5d791e81-19bb-44fa-9d6d-d69df878f29a";


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

        interrogato.nextInt(19);

        RandomOrgClient client = RandomOrgClient.getRandomOrgClient(apiKey);

        client.generateIntegers(19, 1, 19);


    }
}
