package ro.ase.cts.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class ManagerIstoric {
    
    private List<AutobuzMemento> listaAutobuze = new ArrayList<>();
    
    public void adaugaMemento(AutobuzMemento memento) {
        
        listaAutobuze.add(memento);
        
    }
    
    public AutobuzMemento getMemento(int index) {
        
        return listaAutobuze.get(index);
        
    }
    
    public AutobuzMemento getLastMemento() throws Exception {
        
        if(listaAutobuze.size() != 0) {
            
            AutobuzMemento memento = listaAutobuze.get(listaAutobuze.size() - 1);
            listaAutobuze.remove(listaAutobuze.size() - 1);
            return memento;
            
        } else {
            
            throw new Exception("Nu exista stari salvate");
            
        }
        
    }
    
}