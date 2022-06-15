package com.mycompany.Armas;

public class Arma {
    private String nombreArma;
    private int ataque;
    private int punteria;
    private int velocidadDisparo;
    private int cantidadMuniciones;
    private int precioArma;
    
    public Arma() {
        
    }
    
    public void restarMuniciones(int municionesGastadas) {
        setCantidadMuniciones(getCantidadMuniciones() - municionesGastadas);
    }

    public void agregarMuniciones(int municionesCompradas) {
        setCantidadMuniciones(getCantidadMuniciones() + municionesCompradas);
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }

    public int getPrecioArma() {
        return precioArma;
    }
    
    public void setPrecioArma(int precioArma) {
        this.precioArma = precioArma;
    }
    
    public int getAtaque() {
        return ataque;
    }
    
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public int getPunteria() {
        return punteria;
    }
    
    public void setPunteria(int punteria) {
        this.punteria = punteria;
    }
    
    public int getVelocidadDisparo() {
        return velocidadDisparo;
    }
    
    public void setVelocidadDisparo(int velocidadDisparo) {
        this.velocidadDisparo = velocidadDisparo;
    }
    
    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }
    
    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }
    
}
