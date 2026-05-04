package ro.ase.cts.Cafenea;

import java.util.ArrayList;
import java.util.List;

public class Cafenea implements Comanda {

    private List<Observer> observeri;
    private String numeCafenea;

    public Cafenea(String numeCafenea) {
        this.numeCafenea = numeCafenea;
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
            
            observer.receptionareMesaj(numeCafenea + ": " + mesaj);
            
        }
        
    }

    public void notificareNoua() {
        
        trimiteNotificare("Persoana a primit o notificare noua din partea cafenelei");
        
    }
    
}