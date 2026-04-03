package ro.ase.cts.Main;

import ro.ase.cts.Proiect.IProiect;
import ro.ase.cts.Proiect.Proiect;
import ro.ase.cts.Proiect.CreareSoftware;
import ro.ase.cts.Proiect.Software;
import ro.ase.cts.Proiect.SoftwareNou;

public class Main {

    public static void creareSoftware(IProiect proiect) {
        System.out.println("Proiect: ");
        proiect.info();
        System.out.println("Software: ");
        proiect.adaugaProiect();
    }

    public static void main(String[] args) {

        IProiect proiect = new Proiect();
        creareSoftware(proiect);

        System.out.println("Se doreste utilizarea software-ului nou");

        Software software = new Software("Software1", 9);
        IProiect adapter = new SoftwareNou(software);

        creareSoftware(adapter);
        
    }
    
}