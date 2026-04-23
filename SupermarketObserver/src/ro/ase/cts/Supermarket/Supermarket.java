package ro.ase.cts.Supermarket;

import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Notificare {
    
    private List<Observer> observeri;
    private String numeSupermarket;
    
    public Supermarket(String numeSupermarket) {
        this.numeSupermarket = numeSupermarket;
        observeri = new ArrayList<>();
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
    public void trimiteNotificare(String mesaj) {
        
        for (Observer observer : observeri) {
            
            observer.primireMesaj(numeSupermarket + ": " + mesaj);
            
        }
        
    }
    
    public void notificareOferta() {
        trimiteNotificare("Oferta noua aparuta!");
    }
    
}