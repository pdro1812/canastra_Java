package com.pedro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        System.out.println("\nEmbaralhando e distribuindo as cartas...");
        jogoComCoringa.embaralhar();
        jogoComCoringa.distribuir();

        jogoComCoringa.calcularPontos();

        System.out.println("\n--- RESULTADO FINAL ---");

        for (Jogador jogador : jogadores) {
            System.out.println("\nJogador: " + jogador.getNome());
            System.out.println("Mão: " + jogador.getMao());
            System.out.println("Pontuação Total: " + jogador.getPontos());
        }
        
        System.out.println("\nCartas restantes no baralho: " + jogoComCoringa.getCartasRestantes().size());

        sc.close();
    }
}