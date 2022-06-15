package com.mycompany.Personajes;

import com.mycompany.Vehiculos.Vehiculo;

public class Jugador {

    private String nickname;
    private int cantidadOro;
    private Vehiculo[] vehiculosJugador;
    private String paht;
    
    public Jugador() {
        vehiculosJugador = new Vehiculo[1];
        setCantidadOro(100);
        paht = "/Jugador.png";
    }
    
    public void establecerVehiculoInicial(Vehiculo vehiculo) {
        getVehiculosJugador()[0] = vehiculo;
        
    }

    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public int getCantidadOro() {
        return cantidadOro;
    }
    
    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }
    
    public Vehiculo[] getVehiculosJugador() {
        return vehiculosJugador;
    }
    
    public void setVehiculosJugador(Vehiculo[] vehiculosJugador) {
        this.vehiculosJugador = vehiculosJugador;
    }

    public String getPaht() {
        return paht;
    }

    public void setPaht(String paht) {
        this.paht = paht;
    }
    
}
