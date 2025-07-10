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

        Baralho baralho = new Baralho();
        baralho.embaralhar();

        List<Jogador> jogadores = new ArrayList<>();
        for (int i = 1; i <= numJogadores; i++) {
            jogadores.add(new Jogador("Jogador " + i));
        }

        for (Jogador j : jogadores) {
            j.receberCartas(baralho.distribuir(11));
        }

        System.out.println("\n--- Cartas dos Jogadores ---");
        for (Jogador j : jogadores) {
            j.mostrarCartasCompactas();
            System.out.println("Pontuação: " + j.getPontos() + "\n");
        }

        System.out.println("--- Cartas restantes no baralho ---");
        for (Carta c : baralho.getCartasRestantes()) {
            System.out.print(c.getAbreviada() + ", ");
        }
        System.out.println();

        sc.close();
    }
}
