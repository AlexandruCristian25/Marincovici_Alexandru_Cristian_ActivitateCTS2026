package ro.ase.cts.Main;

import ro.ase.cts.Fotbal.RezervareEchipa;

public class Main {
    public static void main(String[] args) {
        
        RezervareEchipa rezervareEchipa = new RezervareEchipa.Builder().setNumeEchipa("Nume: Steaua").build();
        
        System.out.println(rezervareEchipa.toString());
        
    }
}