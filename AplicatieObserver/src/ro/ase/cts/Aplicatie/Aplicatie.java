package ro.ase.cts.Aplicatie;

import java.util.ArrayList;
import java.util.List;

public class Aplicatie implements IAplicatie {
    
    private List<Observer> observatori;
    private String numeAplicatie;
    
    public Aplicatie(String numeAplicatie) {
        this.numeAplicatie = numeAplicatie;
        observatori = new ArrayList<Observer>();
    }
    
    @Override
    public void arataNotificare(Observer observer) {
        observatori.add(observer);
    }
    
    @Override
    public void stergeNotificare(Observer observer) {
        observatori.remove(observer);
    }
    
    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : observatori) {
            observer.primireMesaj(numeAplicatie + ": " + mesaj);
        }
    }
    
    public void notificareNoua() {
        trimiteNotificare("Ai primit o notificare noua");
    }
    
    public void notificareAbonament() {
        trimiteNotificare("Plata abonamentului va incepe din data de 01.03.2026");
    }
    
}