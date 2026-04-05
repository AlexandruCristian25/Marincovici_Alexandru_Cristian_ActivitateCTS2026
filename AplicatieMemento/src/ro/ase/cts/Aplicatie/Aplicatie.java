package ro.ase.cts.Aplicatie;

import java.util.ArrayList;
import java.util.List;

public class Aplicatie {
    
    private List<AplicatieMemento> listaAplicatii = new ArrayList<>();
    
    public void adaugaMemento(AplicatieMemento memento) {
        listaAplicatii.add(memento);
    }
    
    public AplicatieMemento getMemento(int index) {
        return listaAplicatii.get(index);
    }
    
    public AplicatieMemento getLastMemento() throws Exception {
        
        if(listaAplicatii.size() != 0) {
            
            AplicatieMemento memento = listaAplicatii.get(listaAplicatii.size() - 1);
            listaAplicatii.remove(listaAplicatii.size() - 1);
            return memento;
            
        } else {
            throw new Exception("Stari salvate inexistente");
        }
        
    }
    
}