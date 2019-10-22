package com.example.interrogazioni;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.support.v4.app.NotificationCompat;
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

        RandomOrgClient client = RandomOrgClient.getRandomOrgClient(apiKey);

        try{
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "C:\\Users\\xDave\\AndroidStudioProjects\\interrogazioni\\app\\src\\main\\res\\drawable\\WPVG_icon_2016.svg.png")
                    .setContentTitle("Random")
                    .setContentText("Sono stati generati dei numeri")
                    .setPriority(NotificationCompat.PRIORITY_MAX);

            int[] numbers = client.generateIntegers(2, 1, 19);

            for(int i=0; i<numbers.length; i++){
                nInterrogato.append(Integer.toString(numbers[i]));
                nInterrogato.append(", ");
            }

            for(int i=0; i<numbers.length; i++){
                numbers[i] = 0;
            }
        }

        catch(java.net.MalformedURLException e){
                e.printStackTrace();
        }
        catch(java.io.IOException ex){
                ex.printStackTrace();
        }


    }

    public void interrogatoRst(View view) {
        TextView nInterrogato = (TextView) findViewById(R.id.numberToInterrogate);
        nInterrogato.setText("");
    }
}
