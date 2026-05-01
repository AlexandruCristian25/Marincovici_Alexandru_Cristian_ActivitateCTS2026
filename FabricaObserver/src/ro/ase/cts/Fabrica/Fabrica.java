package ro.ase.cts.Fabrica;

import java.util.ArrayList;
import java.util.List;

public class Fabrica implements IFabrica {
    
    private List<Observer> observeri;
    private String numeFabrica;
    
    public Fabrica(String numeFabrica) {
        this.numeFabrica = numeFabrica;
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
            
            observer.primireMesaj(numeFabrica + ": " + mesaj);
            
        }
        
    }
    
    public void trimiteEmail() {
        trimiteNotificare("Angajatul X a primit email de la fabrica");
    }
    
}