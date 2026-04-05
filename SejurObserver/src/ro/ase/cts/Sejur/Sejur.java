package ro.ase.cts.Sejur;

import java.util.ArrayList;
import java.util.List;
import ro.ase.cts.Sejur.Observer;

public class Sejur implements ISejur {
    
    private List<Observer> observeri;
    private String locatie;
    
    public Sejur(String locatie) {
        
        this.locatie = locatie;
        observeri = new ArrayList<Observer>();
        
    }
    
    @Override
    public void adaugaNotificare(Observer observer) {
        
        observeri.add(observer);
        
    }
    
    @Override
    public void stergeNotificare(Observer observer) {
        
        observeri.remove(observer);
        
    }
    
    @Override
    public void trimiteNotificare(String mesaj) {
        
        for(Observer observer : observeri) {
            
            observer.receptionareMesaj(locatie + ":" + mesaj);
            
        }
        
    }
    
    public void notificareOfertaNoua() {
        
        trimiteNotificare("A fost adaugata o noua locatie. Verificati site-ul web");
        
    }
    
    public void notificareReducerePret() {
        
        trimiteNotificare("Preturile pentru sejururi au fost reduse. Verificati site-ul web");
        
    }
    
}