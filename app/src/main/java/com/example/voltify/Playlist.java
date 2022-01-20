package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    TextView txtLista;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        i = getIntent();
        txtLista = (TextView) findViewById(R.id.txtLista);
        txtLista.setText(i.getStringExtra("messaggio"));
    }
}