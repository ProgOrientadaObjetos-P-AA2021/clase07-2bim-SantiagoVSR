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
public class TransporteTransvia extends Transporte {

    private String cooperativaTrasvia;

    public void establecerCooperativaTrasvia(String n) {
        cooperativaTrasvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 5.50;
    }

    public String obtenerCooperativaTrasvia() {
        return cooperativaTrasvia;
    }
 
}
