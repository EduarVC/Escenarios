package com.mycompany.ControlJuego;

import com.mycompany.Escenarios.EstablecerImagen;
import static com.mycompany.JFrame.JFrameEscenario.getFilass;
import static com.mycompany.JFrame.JFrameEscenario.getMatrizCreada;
import com.mycompany.JFrame.JFramePrincipal;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class mover {
    private int posicionVehiculo;
    
    public void Mover(JButton botonSeleccionado, boolean sePuedeMover, int posicion){
        if(botonSeleccionado != null && sePuedeMover){
            for (int i = 0; i < getMatrizCreada().length; i++) {
                for (int j = 0; j < getMatrizCreada()[i].length; j++) {
                    if(j == getFilass()-1 && getMatrizCreada()[i][j].getIcon()!= null ){
                        posicionVehiculo ++;
                        if(posicionVehiculo-1 == posicion){
                        getMatrizCreada()[i][j].setIcon(null);
                    }
                    }
                    
                }
                
            }
            EstablecerImagen establecer = new EstablecerImagen();
            establecer.establecerImagen(botonSeleccionado, JFramePrincipal.getJugador().getPaht());
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede posicionar en esta casilla");
        }
    }
}
