package ro.ase.cts.Bilet;

import java.util.ArrayList;
import java.util.List;

public class Bilet {
    
    private int nrLoc;
    private double pret;
    private List<MementoBilet> listaMementouri = new ArrayList<>();
    
    public Bilet(int nrLoc) {
        super();
        this.nrLoc = nrLoc;
    }
    
    public double getPret() {
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return "Bilet [nrLoc=" + nrLoc + ", pret=" + pret + "]";
    }
    
    public MementoBilet salvareMemento() {
        return new MementoBilet(pret);
    }
    
    public void undoToMemento(MementoBilet memento) {
        this.pret = memento.getPretBilet();
    }
    
    public void adaugaMemento(MementoBilet memento) {
        listaMementouri.add(memento);
    }
    
    public MementoBilet getMemento(int index) {
        return listaMementouri.get(index);
    }
    
}