/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listparkcar;

import java.util.Objects;

/**
 *
 * @author ACER
 */
public class Vehicule implements Comparable<Vehicule>{
     protected int id;
    protected String marque;
    protected String typeDeCarburant;
 
    
    public Vehicule(){}
    public Vehicule(int id , String marque ,String typeDeCarburant){
    this.id=id;
    this.marque=marque;
    this.typeDeCarburant=typeDeCarburant;
            }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDeCarburant() {
        return typeDeCarburant;
    }

    public void setTypeDeCarburant(String typeDeCarburant) {
        this.typeDeCarburant = typeDeCarburant;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "id=" + id + ", marque=" + marque + ", typeDeCarburant=" + typeDeCarburant + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicule other = (Vehicule) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.marque, other.marque)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Vehicule t) {
 return this.id-t.id;
        }
    
    
    
}
