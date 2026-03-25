package ro.ase.cts.Proiect;

import ro.ase.cts.Proiect.Software;
import ro.ase.cts.Proiect.CreareSoftware;

public class SoftwareNou extends CreareSoftware implements IProiect {
    
    public SoftwareNou(Software software) {
        
        super(software);
        
    }
    
    @Override
    public void info() {
        
        System.out.println(super.toString());
        
    }
    
    @Override
    public void adaugaProiect() {
        
        super.creareSoftware();
        
    }
    
}