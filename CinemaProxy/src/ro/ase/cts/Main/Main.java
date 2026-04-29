package ro.ase.cts.Main;

public class Main {
    public static void main(String[] args) {
        
        Persoana persoana = new Persoana("Gigel", 67);
        PachetCinema pachetCinema = new PachetCinema(persoana);
        pachetCinema.detalii();
        
    }
    
}