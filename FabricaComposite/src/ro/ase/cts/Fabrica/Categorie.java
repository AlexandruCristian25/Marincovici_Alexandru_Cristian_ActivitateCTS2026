package ro.ase.cts.Fabrica;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {

    List<Optiune> lista;
    String nume;

    public Categorie(String nume) {
        lista = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        lista.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void detalii() {
        
        System.out.println("Categorie: " + nume);
        for (Optiune optiune : lista) {
            
            optiune.detalii();
            
        }
        
    }
    
}