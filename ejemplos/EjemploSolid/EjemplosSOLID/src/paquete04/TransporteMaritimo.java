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
public class TransporteMaritimo extends Transporte {

    private String cooperativaMaritimo;

    public void establecerCooperativaMaritimo(String n) {
        cooperativaMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 20.00;
    }

    public String obtenerCooperativaMaritimo() {
        return cooperativaMaritimo;
    }
    
}
