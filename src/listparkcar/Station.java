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
public interface Station<Vehicule> {
   public void ajouterVehicule (Vehicule v);
   public boolean rechercherVehicule(Vehicule e);
public boolean rechercherVehicule(String nom);
public void supprimerVehicule(Vehicule e);
public void displayVehicule();
public void trierVehiculeParId();
public void trierVehiculeParmarque();
   public int NbrVoitureEssence();
   public int NbrVoitureNoire();
}
