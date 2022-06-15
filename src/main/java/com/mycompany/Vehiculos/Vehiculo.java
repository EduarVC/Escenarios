
package com.mycompany.Vehiculos;

import com.mycompany.Armas.Arma;
import com.mycompany.ObtenerArmas.ObtenerArma;

public class Vehiculo {
    private String nombreVehiculo;
    private int HP;
    private int PP;
    private int nivel;
    private int experiencia;
    private int puntosAtaque;
    private int puntosDefenza;
    private int punteria;
    private int precioVehiculo;
    private Arma [] armasVehiculo;
    
    
    public Vehiculo(){
        armasVehiculo = new Arma[1];
        setHP(50);
        setPP(5);
        setExperiencia(0);
        setNivel(1);
        
    }

    public void movimientoEspecial(){
        
    }
    public void aumentarHP(){
        HP += 50*nivel;
        setHP(HP);
    }
    public void aumentarPP(){
        PP += 3+(2*nivel);
        setPP(PP);
    }
    public void armaInicial(){
        int numeroArma = (int)(Math.random()*3);
        ObtenerArma armaNueva = new ObtenerArma();
        armasVehiculo[0] = armaNueva.obtenerArma(numeroArma);
    }
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefenza() {
        return puntosDefenza;
    }

    public void setPuntosDefenza(int puntosDefenza) {
        this.puntosDefenza = puntosDefenza;
    }

    public int getPunteria() {
        return punteria;
    }

    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }

    public Arma[] getArmasVehiculo() {
        return armasVehiculo;
    }

    public void setArmasVehiculo(Arma[] armasVehiculo) {
        this.armasVehiculo = armasVehiculo;
    }

    public int getPrecioVehiculo() {
        return precioVehiculo;
    }

    public void setPrecioVehiculo(int precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    
}
