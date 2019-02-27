package org.vipsion.oca.modelo;

public class Casilla {

    protected int posicion;

    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion);
    }

}
