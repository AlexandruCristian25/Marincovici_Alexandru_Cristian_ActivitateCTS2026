package ro.ase.cts.Magazin;

import java.util.ArrayList;
import java.util.List;

public class Magazin implements IMagazin {
    
    List<IMagazin> lista;
    String nume;
    
    public Magazin(String nume) {
        
        lista = new ArrayList<IMagazin>();
        this.nume = nume;
        
    }
    
    @Override
    public void adaugaNod(IMagazin magazin) {
        
        lista.add(magazin);
        
    }
    
    @Override
    public void stergeNod(IMagazin magazin) {
        
        lista.remove(magazin);
        
    }
    
    @Override
    public IMagazin getNod(int index) {
        
        return lista.get(index);
        
    }
    
    @Override
    public void descriere() {
        
        System.out.println("Magazin: " + nume);
        for(IMagazin magazin : lista) {
            
            magazin.descriere();
            
        }
        
    }
    
}