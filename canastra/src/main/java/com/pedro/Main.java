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
        
        int cartasPorJogador = 13;

        System.out.println("        JOGO COM CORINGA");
        System.out.println("__________________________________");
        
        JogoComCoringa jogoComCoringa = new JogoComCoringa(cartasPorJogador, jogadores);
        executarRodada(jogoComCoringa);


        System.out.println("        JOGO SEM CORINGA");
        System.out.println("__________________________________");

        JogoSemCoringa jogoSemCoringa = new JogoSemCoringa(cartasPorJogador, jogadores);
        executarRodada(jogoSemCoringa);


        sc.close();
    }

    public static void executarRodada(Jogo jogo) {
        System.out.println("\nEmbaralhando e distribuindo as cartas...");
        jogo.embaralhar();
        jogo.distribuir();
        jogo.calcularPontos();

        System.out.println("\n--- RESULTADO DA RODADA ---");

        for (Jogador jogador : jogo.jogadores) {
            System.out.println("\nJogador: " + jogador.getNome());
            System.out.println("Mão: " + jogador.getMao());
            System.out.println("Pontuação Total: " + jogador.getPontos());
        }
        
        System.out.println("\nCartas restantes no baralho: " + jogo.getCartasRestantes().size());
    }
}