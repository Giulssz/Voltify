package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnInserisci;
    Button btnInvia;
    EditText txtTitolo;
    EditText txtDurata;
    EditText txtAutore;
    EditText txtDatacreazione;
    GestoreBrani gb;
    String[] generi = {"Pop", "Rock", "Dance", "Indie"};
    Spinner spnGenere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInserisci = (Button)findViewById(R.id.btnInserisci);
        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        btnInvia = (Button)findViewById(R.id.btnInvia);
        txtDurata = (EditText) findViewById(R.id.txtDurata);
        gb = new GestoreBrani();
        spnGenere = (Spinner)findViewById(R.id.spnGenere);
        txtAutore = (EditText) findViewById(R.id.txtAutore);
        txtDatacreazione = (EditText) findViewById(R.id.txtDatacreazione);

        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);

    /*    ArrayAdapter<String> aaG = new ArrayAdapter<String>(
                this, R.layout.support_simple_spinner_dropdown_item, generi);
        spnGenere.setAdapter(aaG);
    */
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Date d = null;
                try{
                    d = format.parse(txtDatacreazione.getText().toString());
                }catch (ParseException e){
                    e.printStackTrace();
                }
    /*            String genSele = spnGenere.getSelectedItem().toString();*/

                gb.addBrano(txtTitolo.getText().toString(), Integer.parseInt(txtDurata.getText().toString()), txtAutore.getText().toString(), d, spnGenere.getSelectedItem().toString());
            }
        });

        btnInvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Playlist.class);
                i.putExtra("messaggio", gb.listaBrani());
                startActivity(i);
            }
        });
    }
}