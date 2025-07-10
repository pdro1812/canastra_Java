package com.pedro;

public class Carta {
    
    protected String naipe;
    protected String numero;


    public Carta(String naipe, String numero ){
        this.naipe = naipe;
        this.numero = numero;
    }

    public String getNaipe(){
        return naipe;
    }
    
    public String getNumero(){
        return numero;
    }



}
