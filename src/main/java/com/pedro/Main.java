package com.pedro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner para ler o que o usuario digitar
        int numJogadores;

        do {
            System.out.print("Informe o número de jogadores (1 a 3): ");
            numJogadores = sc.nextInt();
        } while (numJogadores < 1 || numJogadores > 3);  // so entra se tiver entre 1 a 3 jogadores

        List<Jogador> jogadores = new ArrayList<>(); // lista de jogadores
        for (int i = 1; i <= numJogadores; i++) {
            jogadores.add(new Jogador("Jogador " + i)); //adiciona os jogadores na lista
        }
        
        int cartasPorJogador = 13; // quantidade de cartas do jogo

        System.out.println("        JOGO COM CORINGA");
        System.out.println("__________________________________"); // saida com os jogadores e pontuacao
        
        JogoComCoringa jogoComCoringa = new JogoComCoringa(cartasPorJogador, jogadores);
        executarRodada(jogoComCoringa);


        System.out.println("        JOGO SEM CORINGA"); // saida com os jogadores e pontuacao
        System.out.println("__________________________________");

        JogoSemCoringa jogoSemCoringa = new JogoSemCoringa(cartasPorJogador, jogadores);
        executarRodada(jogoSemCoringa);


        sc.close();
    }

    public static void executarRodada(Jogo jogo) {  // executa a rodada embaralha, distribui e calcula os pontos
        System.out.println("\nEmbaralhando e distribuindo as cartas...");
        jogo.embaralhar();
        jogo.distribuir();
        jogo.calcularPontos();

        System.out.println("\n--- RESULTADO DA RODADA ---");

        for (Jogador jogador : jogo.jogadores) {  // percorre cada jogador e imprime o jogador, mao e pontos
            System.out.println("\nJogador: " + jogador.getNome());
            System.out.println("Mão: " + jogador.getMao());
            System.out.println("Pontuação Total: " + jogador.getPontos());
        }
        
        System.out.println("\nCartas restantes no baralho: " + jogo.getCartasRestantes().size());
    }
}