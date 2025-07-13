package com.pedro;

public class Carta {

    protected String naipe;
    protected String numero;

    public Carta(String naipe, String numero) { // construtor
        this.naipe = naipe;
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() { // toString para retornar a String com o nome e numero de cada carta
        if (this.numero.equals("Coringa")) {
            return "Coringa";
        }
        return numero + " de " + naipe;
    }
}