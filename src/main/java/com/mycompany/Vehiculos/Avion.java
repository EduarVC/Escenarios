package com.mycompany.Vehiculos;

public class Avion extends Vehiculo {

    private double velocidadDisparo;

    public Avion() {
        setNombreVehiculo("Avion");
        setPuntosAtaque(7);
        setPuntosDefenza(3);
        setPunteria(70);
        setVelocidadDisparo(1);
        setPrecioVehiculo(20);
    }

    public void aumetoPunteriaPorNivel() {
        setVelocidadDisparo(getVelocidadDisparo() + 0.1);
    }

    public double getVelocidadDisparo() {
        return velocidadDisparo;
    }

    public void setVelocidadDisparo(double velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }

    @Override
    public void movimientoEspecial() {

    }

}
