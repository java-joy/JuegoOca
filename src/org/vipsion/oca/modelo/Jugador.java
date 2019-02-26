package org.vipsion.oca.modelo;

public class Jugador {

    private Tablero tablero;
    private Ficha ficha;
    private int id;

    public Jugador(int id) {
        this.id = id;
        this.ficha = new Ficha();
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public int juegaTurno(int numDado) {
        this.tablero.mueveFicha(ficha, numDado);
        return ficha.getPosicion();
    }

    public Boolean esGanador() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
