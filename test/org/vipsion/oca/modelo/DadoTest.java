/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vipsion.oca.modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class DadoTest {

    Dado dado = new Dado();

    public DadoTest() {
    }

    @Test
    public void testDameNumero() {
        int numDado = dado.dameNumero();
        assertTrue(numDado >= 1 && numDado <= 6);
    }

}
