package ro.ase.cts.Main;

import ro.ase.cts.Facultate.Facultate;

public class Main {
    public static void main(String[] args) {
        
        Facultate facultate = new Facultate.Builder().setNume("ASE")
                 .setLocatie("Piata Romana").setSpecializare("Informatica Economica").build();
        
        System.out.println(facultate.toString());
        
    }
}