package ro.ase.cts.Main;

import ro.ase.cts.Aplicatie.Aplicatie;
import ro.ase.cts.Aplicatie.Utilizator;

public class Main {
    public static void main(String[] args) {
        
        Utilizator utilizatorAlex = new Utilizator("Alex");
        Utilizator utilizatorBianca = new Utilizator("Bianca");
        Utilizator utilizatorGeorgiana = new Utilizator("Georgiana");
        
        Aplicatie aplicatie = new Aplicatie("WhatsApp");
        
        aplicatie.arataNotificare(utilizatorGeo);
        aplicatie.arataNotificare(utilizatorBianca);
        aplicatie.notificareNoua();
        aplicatie.arataNotificare(utilizatorAlex);
        aplicatie.notificareAbonament();
        
    }
    
}