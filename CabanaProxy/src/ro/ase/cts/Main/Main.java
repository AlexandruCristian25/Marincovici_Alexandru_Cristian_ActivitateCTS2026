package ro.ase.cts.Main;

import ro.ase.cts.Cabana.PachetTurism;
import ro.ase.cts.Cabana.Proprietar;
import ro.ase.cts.Cabana.ProxyPachet;
import ro.ase.cts.Cabana.PachetVacanta;

public class Main {
    public static void main(String[] args) {
        
        Proprietar proprietar = new Proprietar("Ionescu", 45);
        
        PachetVacanta pachetVacanta = new PachetVacanta(proprietar);
        pachetVacanta.rezervarePachet();
        
        ProxyPachet pachetVacantaProxy = new ProxyPachet(proprietar);
        pachetVacantaProxy.rezervarePachet(); 
        
    }
    
}