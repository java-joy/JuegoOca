package org.vipsion.oca.controlador;

import org.vipsion.oca.modelo.Juego;
import org.vipsion.oca.modelo.Dado;
import org.vipsion.oca.vista.OcaGUI;

public class Coordinador {

    private OcaGUI GUI;

    private Juego juego;
    private Dado dado;

    public void setGUI(OcaGUI GUI) {
        this.GUI = GUI;
    }

    public void setLogica(Juego juego) {
        this.juego = juego;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public void tiraDado() {
        int valorDado = dado.dameNumero();
        int turno = juego.getTurno();
        GUI.setValorDado(turno, valorDado);
        int posicionFicha = juego.juega(turno, valorDado);
        GUI.setPosicionTablero(turno, posicionFicha);
        GUI.disableTurno(turno);
        GUI.enableTurno(juego.sigTurno());
        juego.setTurno(juego.sigTurno());

    }

}
