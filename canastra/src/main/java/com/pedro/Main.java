package com.pedro;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numJogadores;

        do {
            System.out.print("Informe o número de jogadores (1 a 3): ");
            numJogadores = sc.nextInt();
        } while (numJogadores < 1 || numJogadores > 3);


            List<Jogador> jogadores = new ArrayList<>();
        for (int i = 1; i <= numJogadores; i++) {
            jogadores.add(new Jogador("Jogador " + i));
        }

        JogoComCoringa jogoComCoringa = new JogoComCoringa(13, jogadores);
        jogoComCoringa.embaralhar();
        jogoComCoringa.distribuir();

        jogoComCoringa.calcularPontos();

        
        

        sc.close();
    }
}
