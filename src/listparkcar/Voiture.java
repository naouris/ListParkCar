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
public class Voiture extends Vehicule{
      private String couleur;

    public String getCouleur() {
        return couleur;
    }
    
    
    public Voiture(int id , String marque ,String typeDeCarburant, String couleur){
        super(id ,marque,typeDeCarburant);
        this.couleur=couleur;
    }

    
    
    
    @Override
    public String toString() {
        return super.toString()+"Voiture{" + "couleur=" + couleur + '}';
    }
    
}
