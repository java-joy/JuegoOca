package org.vipsion.oca.controlador;

import org.vipsion.oca.modelo.Juego;
import org.vipsion.oca.vista.OcaGUI;

public class Coordinador {

    private OcaGUI GUI;

    private Juego juego;

    public void setGUI(OcaGUI GUI) {
        this.GUI = GUI;
    }

    public void setLogica(Juego juego) {
        this.juego = juego;
    }

    public void inicia() {
        int turnoInicio = juego.getTurno();
        GUI.sigTurno(turnoInicio);
    }

    public void juega() {
        juego.juega();
        int posicionTablero = juego.ultimaPosicionTablero();
        int valorDado = juego.ultimoValorDado();
        int turno = juego.getTurno();
        GUI.setValorDado(turno, valorDado);
        GUI.setPosicionTablero(turno, posicionTablero);
        if (juego.esFin()) {
            GUI.setGanador(turno);
        } else {
            int sigTurno = juego.avanzaTurno();
            GUI.sigTurno(sigTurno);
        }
    }

}
