package ro.ase.cts.Masina;

public class Inchiriere implements IMasina {
    
    @Override
    public void info() {
        System.out.println("Pachetul contine doar masina");
    }
    
    @Override
    public void pachetMasina() {
        System.out.println("Rezervarea pachetului realizata cu succes");
    }
    
}