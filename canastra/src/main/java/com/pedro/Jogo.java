package com.pedro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Gatherer.Integrator;

public abstract class Jogo {

    protected Jogador jogador;
    protected int tipoJogo;
    private List<Carta> cartas = new ArrayList<>();

    public void embaralhar(){
        Collections.shuffle(cartas);
    }


    public abstract double getAtruiPontuacao(Carta numero);



    
}
