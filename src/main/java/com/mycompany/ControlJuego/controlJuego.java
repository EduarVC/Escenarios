
package com.mycompany.ControlJuego;

import static com.mycompany.JFrame.JFrameEscenario.getFilass;
import static com.mycompany.JFrame.JFrameEscenario.getMatrizCreada;
import static com.mycompany.JFrame.JFrameEscenario.setAtacarA;
import static com.mycompany.JFrame.JFrameEscenario.setBotonSeleccionadoA;
import static com.mycompany.JFrame.JFrameEscenario.setMoverA;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class controlJuego implements ActionListener{
    
    private JButton botonSeleccionado;
    private JButton[][] arregloBotones;
    private boolean mover;
    private boolean atacar;
    private int posicionJ;
    public controlJuego(){
        mover = false;
        atacar = false;
    }

    public boolean isMover() {
        return mover;
    }

    public void setMover(boolean mover) {
        this.mover = mover;
    }

    public boolean isAtacar() {
        return atacar;
    }

    public void setAtacar(boolean atacar) {
        this.atacar = atacar;
    }

    public int getPosicionJ() {
        return posicionJ;
    }

    public void setPosicionJ(int posicionJ) {
        this.posicionJ = posicionJ;
    }

    public JButton getBotonSeleccionado() {
        return botonSeleccionado;
    }

    public void setBotonSeleccionado(JButton botonSeleccionado) {
        this.botonSeleccionado = botonSeleccionado;
    }

    public JButton[][] getArregloBotones() {
        return arregloBotones;
    }

    public void setArregloBotones(JButton[][] arregloBotones) {
        this.arregloBotones = arregloBotones;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i < getMatrizCreada().length; i++) {
            for (int j = 0; j < getMatrizCreada()[i].length; j++) {
                if (e.getSource().equals(getMatrizCreada()[i][j]) ){
                    setBotonSeleccionado(getMatrizCreada()[i][j]);
                    if(j == 0 && getMatrizCreada()[i][j].getIcon() != null){
                        setAtacar(true);
                        
                    }else if(getMatrizCreada()[i][j].getBackground() == Color.DARK_GRAY){
                        setAtacar(true);
                    }else if(j == getFilass()-1 && getMatrizCreada()[i][j].getBackground() == Color.GREEN && getMatrizCreada()[i][j].getIcon()== null){
                        setMover(true);
                    }else{
                        setAtacar(false);
                        setMover(false);
                    }
                    setPosicionJ(j);
                     setBotonSeleccionadoA(getBotonSeleccionado());
                     setMoverA(isMover());
                     setAtacarA(isAtacar());
                }
                
            }
            
        }
    }
}
