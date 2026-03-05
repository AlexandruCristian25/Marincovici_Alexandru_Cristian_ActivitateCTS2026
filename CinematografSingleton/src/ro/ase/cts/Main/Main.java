package ro.ase.cts.Main;

import ro.ase.cts.Cinematograf.Cinematograf;

public class Main {
    public static void main(String[] args) {
        
        Cinematograf c1 = Cinematograf.getInstance("Adresa Initiala", 100, 5);
        Cinematograf c2 = Cinematograf.getInstance("Alta Adresa", 200, 10);
        
        c1.setAdresa("Adresa1");
        System.out.println("C1 adresa: " + c1.getAdresa());
        
        c2.setAdresa("Adresa2");
        System.out.println("C2 adresa: " + c2.getAdresa());
        System.out.println("C1 adresa acum: " + c1.getAdresa());
        
    }
    
}
