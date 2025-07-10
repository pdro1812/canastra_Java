package com.pedro;

public class CartaEspadas extends Carta{

    public CartaEspadas(String numero) {
        super( "Espadas", numero);

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
