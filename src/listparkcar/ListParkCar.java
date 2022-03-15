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
public class ListParkCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voiture v1=new Voiture(4562,"BMW","essence","noir");
      
        Voiture v2=new Voiture(4562,"peugeot","essence","noir");
 
        Voiture v3=new Voiture(3000,"marsades","gasoile","rouge");

        
         
         StationArrayliste  s1= new StationArrayliste();
         s1.ajouterVehicule(v1);

         s1.ajouterVehicule(v2);
         
         s1.ajouterVehicule(v3);
         
         s1.displayVehicule();
         
            System.out.println("****************************");
 
         
         s1.supprimerVehicule(v2);
         s1.displayVehicule();
         
            System.out.println("****************************");
 
         System.out.println(s1.rechercherVehicule("bmw"));
         
            System.out.println("****************************");
 
         s1.trierVehiculeParId();
         s1.displayVehicule();
         
             System.out.println("****************************");
        
         s1.trierVehiculeParmarque();
         s1.displayVehicule();
         
         
         
    }
    
}
