/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author ASUS
 */
public class TransporteAereo extends Transporte {

    private String cooperativaAereo;

    public void establecerCooperativaAereo(String n) {
        cooperativaAereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 15.50;
    }

    public String obtenerCooperativaAereo() {
        return cooperativaAereo;
    }
}
