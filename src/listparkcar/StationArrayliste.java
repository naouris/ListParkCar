/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listparkcar;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class StationArrayliste implements Station<Vehicule>{
 
            ArrayList<Vehicule> L =new ArrayList<>();

    @Override
    public void ajouterVehicule(Vehicule v) {
L.add(v);    }

    @Override
    public boolean rechercherVehicule(Vehicule e) {
return L.contains(e);
    }

    @Override
    public boolean rechercherVehicule(String marque) {
for(Vehicule v:L){
    if(v.getMarque().equals(marque))
        return true;
}
return false;
    }

    @Override
    public void supprimerVehicule(Vehicule e) {
L.remove(e);
    }

    @Override
    public void displayVehicule() {
for(Vehicule v:L){
    System.out.println(v);
}
    }

    @Override
    public void trierVehiculeParId() {
        Collections.sort(L);
    }

    @Override
    public void trierVehiculeParmarque() {
Collections.sort(L, new Vmarque());    }


    @Override
    public int NbrVoitureEssence() {
 int cmp=0;
       for(Vehicule v:L)
 {
           if (v instanceof Voiture && v.getTypeDeCarburant().equals("essence"))
                 
    cmp++; 
         
   }
   return cmp;
   
       }

   
    @Override
    public int NbrVoitureNoire() {
int cm=0;
       for(Vehicule v:L) {
    if (v instanceof Voiture && ((Voiture)v).getCouleur().equals("noire" ))
    cm++;
 
 }  
       return cm;
    }

    @Override
    public String toString() {
        return "StationArrayliste{" + "L=" + L + '}';
    }
    
}
