package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tablero {

    private List<Casilla> casillas;
    private int numCasillas;

    public Tablero() {
        this.numCasillas = 21;
        this.casillas = new ArrayList<>();
        this.casillas.add(new Casilla(0));
        this.casillas.add(new Casilla(1));
        this.casillas.add(new Casilla(2));
        this.casillas.add(new Casilla(3));
        this.casillas.add(new Casilla(4));
        this.casillas.add(new Casilla(5));
        this.casillas.add(new Casilla(6));
        this.casillas.add(new Casilla(7));
        this.casillas.add(new Casilla(8));
        this.casillas.add(new Casilla(9));
        this.casillas.add(new Casilla(10));
        this.casillas.add(new Casilla(11));
        this.casillas.add(new Casilla(12));
        this.casillas.add(new Casilla(13));
        this.casillas.add(new Casilla(14));
        this.casillas.add(new Casilla(15));
        this.casillas.add(new Casilla(16));
        this.casillas.add(new Casilla(17));
        this.casillas.add(new Casilla(28));
        this.casillas.add(new Casilla(19));
        this.casillas.add(new Casilla(20));
        this.casillas.add(new Casilla(21));

        // TODO: Crear todas las casillas del tablero de la oca
    }

    public void mueveFicha(Ficha ficha, int numDado) {
        int numCasilla = ficha.getPosicion() + numDado;

        casillas.get(numCasilla).posaFicha(ficha);

        // TODO: Calcular posicion si va más allá de la última casilla 
    }

}
