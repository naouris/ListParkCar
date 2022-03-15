/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listparkcar;
import java.util.Comparator;
/**
 *
 * @author ACER
 */
public class Vmarque implements Comparator<Vehicule>{

    @Override
    public int compare(Vehicule t, Vehicule t1) {
return t.getMarque().compareTo(t1.getMarque());    }
    
}
