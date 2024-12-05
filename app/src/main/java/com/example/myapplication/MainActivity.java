package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPlay = findViewById(R.id.btnPlay);
        Button btnPause = findViewById(R.id.btnPause);
        Button btnStop = findViewById(R.id.btnStop);

        // Reproducir música
        btnPlay.setOnClickListener(v -> {
            Intent serviceIntent = new Intent(this, ServicioMusica.class);
            serviceIntent.setAction("PLAY");
            startService(serviceIntent);
        });

        // Pausar música
        btnPause.setOnClickListener(v -> {
            Intent serviceIntent = new Intent(this, ServicioMusica.class);
            serviceIntent.setAction("PAUSE");
            startService(serviceIntent);
        });

        // Detener música
        btnStop.setOnClickListener(v -> {
            Intent serviceIntent = new Intent(this, ServicioMusica.class);
            serviceIntent.setAction("STOP");
            startService(serviceIntent);
        });
    }
}