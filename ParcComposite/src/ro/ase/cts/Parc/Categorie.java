package ro.ase.cts.Parc;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements IParc {
    
    List<IParc> lista;
    String numeParc;
    
    public Categorie(String numeParc) {
        
        lista = new ArrayList<IParc>();
        this.numeParc = numeParc;
        
    }
    
    @Override
    public void stergeNod(IParc parc) {
        
        lista.remove(parc);
        
    }
    
    @Override
    public void adaugaNod(IParc parc) {
        
        lista.add(parc);
        
    }
    
    @Override
    public IParc getNod(int index) {
        
        return lista.get(index);
        
    }
    
    @Override
    public void info() {
        
        System.out.println("Categorie parc " + numeParc);
        for(IParc parc : lista) {
            
            parc.info();
            
        }
        
    }
    
}