package ro.ase.cts.FastFood;

import java.util.ArrayList;
import java.util.List;

public class Aplicatie implements IFastFood {

    private List<Observer> observeri;
    private String numeAplicatie;

    public Aplicatie(String numeAplicatie) {
        this.numeAplicatie = numeAplicatie;
        observeri = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergereObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : observeri) {
            observer.receptionareMesaj(numeAplicatie + ": " + mesaj);
        }
    }

    public void notificareNoua() {
        trimiteNotificare("A fost primita o noua notificare");
    }

    public void notificareReduceri() {
        trimiteNotificare("Oferta cu reducere. Primire notificare");
    }
    
}