package com.example.voltify;

import java.util.Date;

public class Brano {

    private String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;
    private String genere;

    public Brano(String titolo, int durata, String autore, Date datacreazione, String genere){
        this.titolo = titolo;
        this.durata = durata;
        this.autore = autore;
        this.datacreazione = datacreazione;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDatacreazione() {
        return datacreazione;
    }
    public void setDatacreazione(Date datacreazione) {
        this.datacreazione = datacreazione;
    }

}
