package com.mycompany.Manager;

import com.mycompany.JFrame.JFrameDatosJugador;
import com.mycompany.Personajes.Jugador;
import com.mycompany.Vehiculos.Avion;
import com.mycompany.Vehiculos.Tanque;
import com.mycompany.Vehiculos.Vehiculo;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ManagerDatosJugador {
    
    public void ObtenerDatosJugador(JComboBox vehiculo, JTextField nickname){
        Jugador jugador =new Jugador();
        Vehiculo nuevoVehiculo = new Vehiculo();
        jugador.setNickname(nickname.getText());
        
        if(vehiculo.getSelectedIndex() == 0){
            nuevoVehiculo = new Tanque();
        }else{
            nuevoVehiculo = new Avion();
        }
            jugador.establecerVehiculoInicial(nuevoVehiculo);
            jugador.getVehiculosJugador()[0].armaInicial();
            JFrameDatosJugador.setJugador(jugador);
    }
    
}
