package com.example.voltify;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Date;

public class GestoreBrani {

    ArrayList<Brano> listaBrani;
    public GestoreBrani() {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, int durata, String autore, Date datacreazione, String genere){
        Brano b = new Brano(titolo, durata, autore, datacreazione, genere);
        listaBrani.add(b);
    }

    public String listaBrani(){
        StringBuilder stBui =new StringBuilder();
        for (Brano brV : listaBrani){
            stBui.append(brV.toString());
            stBui.append(",");
        }
        stBui.deleteCharAt(-1); /* elimina l'ultimo crattere della stringa dello string build*/
        stBui.append(".");
        String s = stBui.toString();
        return s;
    }

}
