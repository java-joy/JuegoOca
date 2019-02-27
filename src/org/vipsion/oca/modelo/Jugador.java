package org.vipsion.oca.modelo;

public class Jugador {

    private Ficha ficha;
    private int id;
    private int ultimoValorDado;

    public Jugador(int id) {
        this.id = id;
        this.ficha = new Ficha();
    }

    public int juegaTurno(Tablero tablero, Dado dado) {
        ultimoValorDado = dado.dameNumero();
        tablero.mueveFicha(ficha, ultimoValorDado);
        return ficha.getPosicion();
    }

    public int getUltimoValorDado() {
        return ultimoValorDado;
    }

    public void setUltimoValorDado(int ultimoValorDado) {
        this.ultimoValorDado = ultimoValorDado;
    }

    public int getUltimaPosicionTablero() {
        return ficha.getPosicion();
    }

    public int getTurnosExtra() {
        return (ficha.getTurnosExtra());
    }

    public void decrementaTurnosExtra() {
        ficha.decrementaTurnosExtra();
    }

    public Boolean esGanador() {
        return  ficha.getFin();
    }
}
