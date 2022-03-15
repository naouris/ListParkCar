/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listparkcar;

/**
 *
 * @author ACER
 */
public class Camion extends Vehicule{
     private int nbrPlace;

    @Override
    public String toString() {
        return super.toString()+"Camion{" + "nbrPlace=" + nbrPlace + '}';
    }
}
