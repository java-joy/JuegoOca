package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;
import org.vipsion.oca.controlador.Coordinador;

public class Juego {

    private Coordinador coordinador;
    private List<Jugador> jugadores;
    private int turno = 0;
    private Dado dado;

    public Juego() {
        jugadores = new ArrayList<>();

        Tablero tablero = new Tablero();
        Dado dado = new Dado();

        Jugador jugador1 = new Jugador(0);
        jugador1.setTablero(tablero);

        Jugador jugador2 = new Jugador(1);
        jugador2.setTablero(tablero);

        jugadores.add(jugador1);
        jugadores.add(jugador2);

    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public int sigTurno() {
        return ((this.turno + 1) % 2);
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return (this.turno);
    }

    public int juega(int turno, int dado) {
        return (jugadores.get(turno).juegaTurno(dado));
        
    }
}
