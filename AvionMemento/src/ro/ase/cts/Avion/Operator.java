package ro.ase.cts.Avion;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    
    private List<AvionMemento> listaOperatori = new ArrayList<>();
    
    public void adaugaMemento(AvionMemento memento) {
        
        listaOperatori.add(memento);
        
    }
    
    public AvionMemento getMemento(int index) {
        
        return listaOperatori.get(index);
        
    }
    
    public AvionMemento getLastMemento() throws Exception {
        
        if(listaOperatori.size() != 0) {
            
            AvionMemento memento = listaOperatori.get(listaOperatori.size() - 1);
            listaOperatori.remove(listaOperatori.size() - 1);
            return memento;
            
        } else {
            
            throw new Exception("Nu exista stari salvate!");
            
        }
        
    }
    
}