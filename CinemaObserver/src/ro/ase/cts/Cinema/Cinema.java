package ro.ase.cts.Cinema;

import java.util.ArrayList;
import java.util.List;
import ro.ase.cts.Cinema.Observer;

public class Cinema implements Mesaj {
    
    private List<Observer> observeri;
    private String numeCinema;
    
    public Cinema(String numeCinema) {
        
        this.numeCinema = numeCinema;
        observeri = new ArrayList<Observer>();
        
    }
    
    @Override
    public void adaugaObserver(Observer observer) {
        
        observeri.add(observer);
        
    }
    
    @Override
    public void stergeObserver(Observer observer) {
        
        observeri.remove(observer);
        
    }
    
    @Override
    public void trimiteMesaj(String mesaj) {
        
        for(Observer observer : observeri) {
            
            observer.trimiteMesaj(numeCinema + ":" + mesaj);
            
        }
        
    }
    
}