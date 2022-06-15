package com.mycompany.Escenarios;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EstablecerImagen {
    private static ImageIcon imagen;
    private static Icon icono;
    
    public final void establecerImagen(JButton lbl, String ruta) {
        EstablecerImagen.imagen = new ImageIcon(getClass().getResource(ruta));
        EstablecerImagen.icono = new ImageIcon(
                EstablecerImagen.imagen.getImage().getScaledInstance(
                        35,
                        35,
                        Image.SCALE_DEFAULT));
        lbl.setIcon(EstablecerImagen.icono);
    }
}
