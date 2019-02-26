package org.vipsion.oca.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle;

import org.vipsion.oca.controlador.Coordinador;

public class PanelJugador extends JPanel {

    private JButton tiraDado;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField valorDado;
    private JTextField posicionTablero;
    private Coordinador coordinador;

    public PanelJugador() {
        initComponents();
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public void setValorDado(int valor) {
        valorDado.setText(Integer.toString(valor));    
    }

    public void setPosicionTablero(int posicion) {
        posicionTablero.setText(Integer.toString(posicion));
    }
    
    public void disableTiraDado() {
        tiraDado.setEnabled(false);
    }
    
    public void enableTiraDado() {
        tiraDado.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        valorDado = new JTextField();
        posicionTablero = new JTextField();
        tiraDado = new JButton();
        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText("Jugador 1");
        jLabel3.setText("Estado de la partida:");
        jLabel4.setText("Posición de la ficha: ");
        valorDado.setText("valorDado");
        tiraDado.setText("TiraDado");
        tiraDado.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                tiraDadoActionPerformed(evt);
            }
        });
        posicionTablero.setText("posicionTablero");
        GroupLayout jPanel1Layout = new GroupLayout(this);
        this.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(
                        GroupLayout.Alignment.LEADING).addGroup(
                                jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                GroupLayout.Alignment.LEADING).addGroup(
                                                        jPanel1Layout.createSequentialGroup().addGap(50, 50, 50)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel4).addGap(58, 58, 58).addComponent(posicionTablero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel3).addComponent(jLabel1))).addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60).addComponent(tiraDado).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(valorDado, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))).addContainerGap(275, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(51, 51, 51)
                                .addComponent(jLabel1).addGap(58, 58, 58).addComponent(jLabel3).addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel4)
                                        .addComponent(posicionTablero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(tiraDado).addComponent(valorDado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(102, Short.MAX_VALUE)));
    }

    private void tiraDadoActionPerformed(ActionEvent evt) {
        coordinador.tiraDado();
    }

}
