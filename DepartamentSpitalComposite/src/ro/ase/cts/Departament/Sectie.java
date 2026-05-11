package ro.ase.cts.Departament;

import java.util.ArrayList;
import java.util.List;

public class Sectie implements Optiune {
    private String nume;
    private List<Optiune> lista = new ArrayList<>();

    public Sectie(String nume) {
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
    public void afiseaza(String indentare) {
        System.out.println(indentare + "Sectie: " + nume);

        for (Optiune optiune : lista) {
            optiune.afiseaza(indentare + "   ");
        }
        
    }
    
}