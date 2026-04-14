package ro.ase.cts.Medicament;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Sectiune {
    
    List<Sectiune> lista;
    String nume;
    
    public Categorie(String nume) {
        lista = new ArrayList<Sectiune>();
        this.nume = nume;
    }
    
    @Override
    public void adaugareMedicament(Sectiune sectiune) {
        lista.add(sectiune);
    }
    
    @Override
    public void stergeMedicament(Sectiune sectiune) {
        lista.remove(sectiune);
    }
    
    @Override
    public Sectiune getMedicament(int index) {
        return lista.get(index);
    }
    
    @Override
    public void info() {
        System.out.println("Categorie: " + nume);
        for(Sectiune sectiune : lista) {
            
            sectiune.info();
            
        }
        
    }
    
}