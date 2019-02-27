package org.vipsion.oca.modelo;

public class Oca extends Casilla {

    private final int desplazamiento;
    private final int turnosExtra;

    public Oca(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
        this.turnosExtra = 1;
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setTurnosExtra(turnosExtra);
    }
}
