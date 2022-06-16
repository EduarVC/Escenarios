package com.mycompany.Escenarios;

import static com.mycompany.JFrame.JFrameEscenario.lblEscenario;
import static com.mycompany.JFrame.JFramePrincipal.getEnemigo;
import static com.mycompany.JFrame.JFramePrincipal.getJugador;
import javax.swing.JButton;

public class CrearEscenarios {

    private JButton[][] matriz;
    private int columnas;
    private int filas;

    public CrearEscenarios() {

    }

    public void obtenerTamaño(int opcion) {
        switch (opcion) {
            case 1:
                setFilas(6);
                setColumnas(6);
                break;
            case 2:
                setFilas(10);
                setColumnas(10);
                break;
            case 3:
                setFilas(15);
                setColumnas(15);
                break;
            default:
                break;
        }
    }

    public Campo generarCampo() {
        Campo campo = new Campo();
        int numero = (int) (Math.random() * 100 + 1);
        if (numero <= 25) {
            campo = new Montaña();
        } else if (numero > 25 && numero <= 40) {
            campo = new Agua();
        } else if (numero > 40) {
            campo = new Tierra();
        }
        return campo;
    }

    public void generarMatriz(int opcion) {
        EstablecerImagen establecerIMG = new EstablecerImagen();
        int x = 10;
        int y = 10;
        int contadorEnemigo = 0;
        int contadorJugador = 0;
        String path = null;
        boolean jugador = true;
        boolean enemigo = true;

        obtenerTamaño(opcion);
        matriz = new JButton[columnas][filas];
        Campo nuevoCampo = new Campo();
        for (int i = 0; i < getColumnas(); i++) {
            for (int j = 0; j < getFilas(); j++) {

                nuevoCampo = generarCampo();
                matriz[i][j] = new JButton();
                matriz[i][j].setBounds(x, y, 50, 50);
                matriz[i][j].setBackground(nuevoCampo.getColorCampo());

                if (enemigo) {
                    if ("Tierra".equals(nuevoCampo.getTipoCampo())) {
                        if (j == 0) {

                            path = getEnemigo().getPathEnemigo();
                            contadorEnemigo++;
                            if (path != null) {
                                establecerIMG.establecerImagen(matriz[i][j], path);
                            }
                        }
                    }
                    if (jugador) {
                        if ("Tierra".equals(nuevoCampo.getTipoCampo())) {
                            if (j == getFilas() - 1) {

                                path = getJugador().getPaht();
                                contadorJugador++;
                                System.out.println(contadorJugador);
                                if (path != null) {
                                    establecerIMG.establecerImagen(matriz[i][j], path);
                                }
                            }
                        }
                    }
                }
                if (contadorEnemigo >= getEnemigo().getVehiculosEnemigo().length) {
                    enemigo = false;
                }
                if (contadorJugador >= getJugador().getVehiculosJugador().length) {
                    jugador = false;
                }
                lblEscenario.add(matriz[i][j]);

                y += 50;
            }
            x += 50;
            y = 10;
        }
    }

    public JButton[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(JButton[][] matriz) {
        this.matriz = matriz;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

}
