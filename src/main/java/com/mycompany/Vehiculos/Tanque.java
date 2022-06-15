package com.mycompany.Vehiculos;

public class Tanque extends Vehiculo {

    public Tanque() {
        setNombreVehiculo("Tanque");
        setPuntosAtaque(10);
        setPuntosDefenza(6);
        setPunteria(50);
        setPrecioVehiculo(15);
    }

    @Override
    public void movimientoEspecial() {

    }
}
