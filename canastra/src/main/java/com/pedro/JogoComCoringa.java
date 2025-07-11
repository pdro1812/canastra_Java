package com.pedro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JogoComCoringa extends Jogo {


    public JogoComCoringa(int quantidade, List<Jogador> jogadores) {
        super(quantidade, jogadores);
    }


    @Override
    public  void embaralhar()
    {
        Collections.shuffle(cartas);
    }




    @Override
    public double getAtruiPontuacao(Carta numero){
        String valor = numero.getNumero();
        switch (valor) {
            case "3":
            case "4":
            case "5":
            case "6":
                return 0.5;

            case "2":
            case "7":
            case "8":
            case "9":
            case "10":
            case "J":
            case "Q":
            case "K":
                return 1;

            case "A":
                return 1.5;

            default:
                return 2;
            }

        }


   

    
}
