package org.vipsion.oca.modelo;

public class OcaFin extends Casilla {

    private int desplazamiento;

    public OcaFin(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
    }

    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setFin(true);
    }
}
