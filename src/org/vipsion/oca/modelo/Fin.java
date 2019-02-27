package org.vipsion.oca.modelo;

public class Fin extends Casilla {

    public Fin(int posicion) {
        super(posicion);
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setFin(true);
    }
}
