package ro.ase.cts.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Director {
    
    private List<MementoBiblioteca> listaBiblioteci = new ArrayList<>();
    
    public void adaugaMemento(MementoBiblioteca memento) {
        
        listaBiblioteci.add(memento);
        
    }
    
    public MementoBiblioteca getMemento(int index) {
        
        return listaBiblioteci.get(index);
        
    }
    
    public MementoBiblioteca getLastMemento() throws Exception {
        
        if(listaBiblioteci.size() != 0) {
            
            MementoBiblioteca memento = listaBiblioteci.get(listaBiblioteci.size() - 1);
            listaBiblioteci.remove(listaBiblioteci.size() - 1);
            return memento;
            
        } else {
            
            throw new Exception("Nu exista stari salvate");
            
        }
        
    }
    
}