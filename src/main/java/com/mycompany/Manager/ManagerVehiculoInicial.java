package com.mycompany.Manager;

import static com.mycompany.JFrame.JFramePrincipal.getJugador;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class ManagerVehiculoInicial {

public void establecerCmb(JComboBox cmb){
     DefaultComboBoxModel model = (DefaultComboBoxModel) cmb.getModel();
     model.removeAllElements();
     for (int i = 0; i < getJugador().getVehiculosJugador().length; i++) {
        model.addElement(getJugador().getVehiculosJugador()[i].getNombreVehiculo());
        
    }
} 
public int numeroVehiculoInicial(JComboBox cmb){
    int index = cmb.getSelectedIndex();
    return index;
}
}
