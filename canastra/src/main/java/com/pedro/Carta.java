package com.pedro;

public abstract class Carta {
    
    protected String naipe;
    protected String numero;

    public Carta(String naipe, String numero){
        this.naipe = naipe;
        this.numero = numero;

    }

    public String getNaipe(){
        return naipe;
    }
    
    public String getNumero(){
        return numero;
    }

    public String getAbreviacao(){
        switch (naipe) {
            case "Copas": return "C";
            case "Ouros": return "O";
            case "Paus": return "P";
            case "Espadas": return "E";
            default: return "?";
        }
    }

    public String getAbreviada(){
        return numero + getAbreviacao();
    }

    public abstract double getPontos();
}
