package com.mycompany.Tienda;

import com.mycompany.Armas.Arma;

public class CrearArma {

    private Arma[] armasDisponibles;

    public CrearArma() {
        armasDisponibles = new Arma[0];
    }

    public void crearArma(String nombre, int ataque, int punteria, int velocidad, int municiones, int precio) {
        Arma armaNueva = new Arma();
        Arma[] nuevaArma = new Arma[getArmasDisponibles().length + 1];
        armaNueva.setNombreArma(nombre);
        armaNueva.setAtaque(ataque);
        armaNueva.setCantidadMuniciones(municiones);
        armaNueva.setPunteria(punteria);
        armaNueva.setVelocidadDisparo(velocidad);
        armaNueva.setPrecioArma(precio);
        for (int i = 0; i < nuevaArma.length; i++) {
            if (i == nuevaArma.length - 1) {
                nuevaArma[i] = armaNueva;
            } else {
                nuevaArma[i] = getArmasDisponibles()[i];
            }

        }
        setArmasDisponibles(nuevaArma);
    }

    public Arma[] getArmasDisponibles() {
        return armasDisponibles;
    }

    public void setArmasDisponibles(Arma[] armasDisponibles) {
        this.armasDisponibles = armasDisponibles;
    }

}
