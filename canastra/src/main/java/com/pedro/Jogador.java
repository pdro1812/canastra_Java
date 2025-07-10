package com.pedro;


import java.util.*;


public class Jogador {
    
    private String nome;
    private List<Carta> mao = new ArrayList<>();


    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberCartas(List <Carta> cartas){
        mao.addAll(cartas);
    };

        public int calcularPontos() {
        int total = 0;
        for (Carta c : mao) {
            total += c.getPontos();
        }
        return total;
    }

    public void mostrarCartasCompactas() {
        System.out.print(nome + ": ");
        for (Carta c : mao) {
            System.out.print(c.getAbreviada() + ", ");
        }
        System.out.println(); 
    }

    public int getPontos() {
        return calcularPontos();
    }


}
