package ro.ase.cts.Aeroport;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    private List<AeroportMemento> listaBilete = new ArrayList<>();
    
    public void adaugaMemento(AeroportMemento memento) {
        listaBilete.add(memento);
    }
    
    public AeroportMemento getMemento(int index) {
        return listaBilete.get(index);
    }
    
    public AeroportMemento getLastMemento() throws Exception {
        
        if(listaBilete.size() > 0) {
            
            AeroportMemento memento = listaBilete.get(listaBilete.size() - 1);
            listaBilete.remove(listaBilete.size() - 1);
            return memento;
            
        } else {
            
            throw new Exception("Nu exista stari salvate");
            
        }
        
    }
    
}