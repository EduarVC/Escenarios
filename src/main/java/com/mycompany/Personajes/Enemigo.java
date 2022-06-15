package com.mycompany.Personajes;

import com.mycompany.Vehiculos.Tanque;
import com.mycompany.Vehiculos.Vehiculo;

public class Enemigo {
    private Vehiculo [] vehiculosEnemigo;
    private String pathEnemigo;
    private String nombreEnemigo;
    
    public Enemigo(){
        nombreEnemigo = "IA";
        vehiculosEnemigo = new Vehiculo[3];
        vehiculosEnemigo[0] = new Tanque();
        vehiculosEnemigo[1] = new Tanque();
        vehiculosEnemigo[2] = new Tanque();
        pathEnemigo = "/Enemigo.png";
    }

    public Vehiculo[] getVehiculosEnemigo() {
        return vehiculosEnemigo;
    }

    public void setVehiculosEnemigo(Vehiculo[] vehiculosEnemigo) {
        this.vehiculosEnemigo = vehiculosEnemigo;
    }

    public String getPathEnemigo() {
        return pathEnemigo;
    }

    public void setPathEnemigo(String pathEnemigo) {
        this.pathEnemigo = pathEnemigo;
    }

    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public void setNombreEnemigo(String nombreEnemigo) {
        this.nombreEnemigo = nombreEnemigo;
    }
    
}
