package ro.ase.cts.Companie;

import java.util.ArrayList;
import java.util.List;

public class Departament implements BazaDate {
    
    List<BazaDate> lista;
    String nume;
    
    public Departament(String nume) {
        lista = new ArrayList<>();
        this.nume = nume;
    }
    
    @Override
    public void stergeAngajat(BazaDate bazaDate) {
        lista.remove(bazaDate);
    }
    
    @Override
    public void adaugaAngajat(BazaDate bazaDate) {
        lista.add(bazaDate);
    }
    
    @Override
    public void detalii() {
        
        System.out.println("Departament: " + nume);
        for(BazaDate bazaDate : lista) {
            bazaDate.detalii();
        }
        
    }
    
}