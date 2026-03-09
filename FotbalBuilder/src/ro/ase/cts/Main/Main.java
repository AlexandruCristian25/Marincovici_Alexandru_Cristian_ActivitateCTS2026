package ro.ase.cts.Main;

import ro.ase.cts.RezervareEchipa.RezervareEchipa;

public class Main {
    public static void main(String[] args) {
        
        RezervareEchipa rezervareEchipa = new RezervareEchipa.Builder().setNumeEchipa("Nume: Steaua").build();
        
        System.out.println(rezervareEchipa.toString());
        
    }
}