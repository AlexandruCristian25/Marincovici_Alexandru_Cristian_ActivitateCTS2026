package ro.ase.cts.Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Categorie implements Rezervare {
    
    List<Rezervare> lista;
    String denumire;
    
    public Categorie(String denumire) {
        
        lista = new ArrayList<Rezervare>();
        this.denumire = denumire;
        
    }
    
    @Override
    public void stergeRezervare(Rezervare rezervare) {
        
        lista.remove(rezervare);
        
    }
    
    @Override
    public void adaugaRezervare(Rezervare rezervare) {
        
        lista.add(rezervare);
        
    }
    
    @Override
    public void getRezervare(Rezervare rezervare) {
        
        return lista.get(index);
        
    }
    
    @Override
    public void info() {
        
        System.out.println("Categorie " + denumire);
        for(Rezervare rezervare : lista) {
            
            rezervare.inf();
            
        }
        
    }
    
}