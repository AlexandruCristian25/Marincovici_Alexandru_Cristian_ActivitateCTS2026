package ro.ase.cts.Cafenea;

import java.util.ArrayList;
import java.util.List;

public class Cafenea {
    
    private String nume;
    private String locatie;
    private List<CafeneaMemento> mementouri = new ArrayList<>();

    public Cafenea(String nume) {
        super();
        this.nume = nume;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    @Override
    public String toString() {
        return "Cafenea [nume=" + nume + ", locatie=" + locatie + "]";
    }
    
    public CafeneaMemento salvareMemento() {
        return new CafeneaMemento(nume);
    }
    
    public void undoToMemento(CafeneaMemento memento) {
        this.nume = memento.getNume();
    }
    
    public void adaugaMemento(CafeneaMemento memento) {
        mementouri.add(memento);
    }

    public CafeneaMemento getMemento(int index) {
        return mementouri.get(index);
    }
    
}