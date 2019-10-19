package com.example.interrogazioni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.interrogazioni.RandomJSONRPC.src.org.random.api.RandomOrgClient;

import java.io.OutputStream;
import java.net.URL;

import java.io.IOException;
import java.net.HttpURLConnection;

public class classList extends AppCompatActivity {
    public String apiKey = "5d791e81-19bb-44fa-9d6d-d69df878f29a";
    public ListView listView =  (ListView) findViewById(R.id.studentList);
    public String apiUrl = "https://api.random.org/json-rpc/2/invoke";

    public String[] studenti = {
            "Capasso Manuele",
            "Capotosto Nicola",
            "Ciccone Alessandro",
            "Crescimbeni Gerardo Gabriel",
            "Cupo Cristian",
            "Di Russo Giovanni",
            "di Sarra Alessandro",
            "di Trocchio Davide",
            "Lambraia Emanuele",
            "Maggiacomo Valerio",
            "Manzi Francesco",
            "Masella Mario",
            "Mastrobattista Matteo",
            "Mongelli Antonio",
            "Pannozzo Alessio",
            "Pietrobuono Andrea Junior",
            "Staiano Stefano",
            "Vellucci Mattia",
            "Vollono Bruno"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_list);

    }





}
