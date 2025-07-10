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

}
