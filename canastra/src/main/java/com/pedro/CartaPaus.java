package com.pedro;

public class CartaPaus extends Carta{

    public CartaPaus(String numero) {
        super( "Paus", numero);

    }

    @Override
    public double getPontos() {
        if (numero.equals("3") || numero.equals("4") || numero.equals("5") || numero.equals("6")) {
            return 0.5;
        } else if (numero.equals("A")) {
            return 1.5;
        } else {
            return 1;
        }
    }

    
}
