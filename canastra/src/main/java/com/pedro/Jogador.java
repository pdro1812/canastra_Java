package com.pedro;

import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;
    private double pontos;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void receberCartas(List<Carta> cartas) {
        this.mao = cartas;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public String getNome() {
        return nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }
}
