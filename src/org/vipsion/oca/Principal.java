package org.vipsion.oca;

import org.vipsion.oca.vista.OcaGUI;
import org.vipsion.oca.controlador.Coordinador;
import org.vipsion.oca.modelo.Juego;
import org.vipsion.oca.modelo.Dado;


public class Principal {
    public static void main(String[] args) {
        Coordinador miCoordinador = new Coordinador();
        Juego miJuego = new Juego();
        OcaGUI miGUI = new OcaGUI();
        Dado miDado = new Dado();
        miJuego.setCoordinador(miCoordinador);
        miGUI.setCoordinador(miCoordinador);
        miCoordinador.setGUI(miGUI);
        miCoordinador.setLogica(miJuego);
        miCoordinador.setDado(miDado);
        miGUI.setVisible(true);
       // miLogica.juega();
        
    }
}
