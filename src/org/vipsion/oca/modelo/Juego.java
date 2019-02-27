package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;
import org.vipsion.oca.controlador.Coordinador;

public class Juego {

    private Coordinador coordinador;
    private List<Jugador> jugadores;
    private int turno = 0;
    private Tablero tablero;
    private Dado dado;
    private int numJugadores = 2;

    public Juego() {
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        dado = new Dado();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public int sigTurno() {
        int sigTurno;
        sigTurno = (turno + 1) % numJugadores;
        if (jugadores.get(turno).getTurnosExtra() > 0) {
            sigTurno = turno;
            jugadores.get(turno).decrementaTurnosExtra();
        }
        return (sigTurno);
    }

    public int avanzaTurno() {
        turno = sigTurno();
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getTurno() {
        return (turno);
    }

    public int ultimoValorDado() {
        return jugadores.get(turno).getUltimoValorDado();
    }

    public int ultimaPosicionTablero() {
        return jugadores.get(turno).getUltimaPosicionTablero();
    }

    public void juega() {
        jugadores.get(turno).juegaTurno(tablero, dado);
    }

    public Boolean esFin() {
        return jugadores.get(turno).esGanador();
    }
}
