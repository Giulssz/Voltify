package com.example.voltify;

import java.util.ArrayList;

public class GestoreBrani {

    ArrayList<Brano> listaBrani;
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, int durata){
        Brano b = new Brano(titolo, durata);
        listaBrani.add(b);
    }

    public void listaBrani(){
        StringBuilder stBui =new StringBuilder();
        for (Brano brV : listaBrani){
            stBui.append(brV.toString());
        }
    }

}
