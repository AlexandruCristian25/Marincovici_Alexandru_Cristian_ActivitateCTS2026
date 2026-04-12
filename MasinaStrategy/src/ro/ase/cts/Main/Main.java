package ro.ase.cts.Main;

import ro.ase.cts.Masina.MasinaCombustibil;
import ro.ase.cts.Masina.MasinaElectrica;
import ro.ase.cts.Masina.MasinaHiybrid;
import ro.ase.cts.Masina.Sofer;

public class Main {
    public static void main(String[] args) {
        
        Sofer sofer = new Sofer("Ghita");
        
        sofer.setTipMasina(new MasinaCombustibil());
        sofer.conduce(100);
        
        sofer.setTipMasina(new MasinaElectrica());
        sofer.conduce(50);
        
        sofer.setTipMasina(new MasinaHiybrid());
        sofer.conduce(70);
        
    }
    
}