package org.vipsion.oca.modelo;

public class Dado {
    public int dameNumero() {
        return (int) (Math.random() * 6) + 1;
    }
}
