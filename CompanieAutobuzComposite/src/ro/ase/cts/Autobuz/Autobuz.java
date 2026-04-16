package ro.ase.cts.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Optiune {
    
    List<Optiune> lista;
    private String producator;
    private String model;
    private int nrLocuri;
    
    public Autobuz(String producator, String model, int nrLocuri) {
        this.lista = new ArrayList<Optiune>();
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }
    
    // constructor folosit în Main
    public Autobuz(String producator) {
        this.lista = new ArrayList<Optiune>();
        this.producator = producator;
        this.model = "";
        this.nrLocuri = 0;
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
    public void afisareInfo() {
        
        System.out.println("Autobuz: " + producator + " " + model + " " + nrLocuri);
        
        for(Optiune optiune : lista) {
            
            optiune.afisareInfo();
            
        }
        
    }
    
}