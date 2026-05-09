package ro.ase.cts.Produs;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {

    private List<Optiune> lista;
    private String numeC;

    public Categorie(String numeC) {
        this.lista = new ArrayList<>();
        this.numeC = numeC;
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
    public void info() {
        
        System.out.println("Categorie: " + numeC);
        for (Optiune optiune : lista) {
            
            optiune.info();
            
        }
        
    }
    
}