package com.mycompany.Manager;

import static com.mycompany.JFrame.JFramePrincipal.cmbArmasVehi;
import static com.mycompany.JFrame.JFramePrincipal.cmbVehiculos;
import static com.mycompany.JFrame.JFramePrincipal.getJugador;
import static com.mycompany.JFrame.JFramePrincipal.lblAtaque;
import static com.mycompany.JFrame.JFramePrincipal.lblDefenza;
import static com.mycompany.JFrame.JFramePrincipal.lblHP;
import static com.mycompany.JFrame.JFramePrincipal.lblNickname;
import static com.mycompany.JFrame.JFramePrincipal.lblNivel;
import static com.mycompany.JFrame.JFramePrincipal.lblNombre;
import static com.mycompany.JFrame.JFramePrincipal.lblOro;
import static com.mycompany.JFrame.JFramePrincipal.lblPP;
import static com.mycompany.JFrame.JFramePrincipal.lblPunteria;
import static com.mycompany.JFrame.JFramePrincipal.lblXP;
import com.mycompany.Vehiculos.Vehiculo;
import javax.swing.DefaultComboBoxModel;

public class ManagerPrincipal {

    public void EstablecerDatos() {
        lblNickname.setText(getJugador().getNickname());
        lblOro.setText(Integer.toString(getJugador().getCantidadOro()));
        CmbVehiculos();
        iniciarDatodVehiculo();
        
        
    }
    public void CmbVehiculos(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbVehiculos.getModel();
//        model.removeAllElements();
        for (int i = 0; i < getJugador().getVehiculosJugador().length; i++) {
            model.addElement(getJugador().getVehiculosJugador()[i].getNombreVehiculo());
        }
    }
    
    public void CmbArmas(Vehiculo vehiculo){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cmbArmasVehi.getModel();
        model.removeAllElements();
        for (int i = 0; i < vehiculo.getArmasVehiculo().length; i++) {
            model.addElement(vehiculo.getArmasVehiculo()[i].getNombreArma());
        }
    }
    public void iniciarDatodVehiculo(){
        int numeroSeleccionado = 0;
        numeroSeleccionado = cmbVehiculos.getSelectedIndex();
        lblNombre.setText(getJugador().getVehiculosJugador()[numeroSeleccionado].getNombreVehiculo());
        lblHP.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getHP()));
        lblPP.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getPP()));
        lblNivel.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getNivel()));
        lblXP.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getExperiencia()));
        lblAtaque.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getPuntosAtaque()));
        lblDefenza.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getPuntosDefenza()));
        lblPunteria.setText(Integer.toString(getJugador().getVehiculosJugador()[numeroSeleccionado].getPunteria()));
        CmbArmas(getJugador().getVehiculosJugador()[numeroSeleccionado]);
    }
}
