package com.mycompany.ObtenerArmas;

import com.mycompany.Armas.Arma;
import com.mycompany.Armas.Cañon;
import com.mycompany.Armas.LanzaGranada;
import com.mycompany.Armas.Metralleta;

public class ObtenerArma {
    
    public Arma obtenerArma(int numeroArma){
        Arma nuevaArma = new Arma();
        switch (numeroArma) {
            case 0:
                nuevaArma = new LanzaGranada();
                break;
            case 1:
                nuevaArma = new Metralleta();
                break;
            case 2:
                nuevaArma = new Cañon();
                break;
            default:
                break;
        }
        return nuevaArma;
    }
}
