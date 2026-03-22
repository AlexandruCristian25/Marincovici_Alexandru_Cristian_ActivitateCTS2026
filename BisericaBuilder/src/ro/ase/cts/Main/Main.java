package to.ase.cts.Main;

import to.ase.cts.Biserica.Biserica;

public class Main {
    public static void main(String[] args) {
        
        Biserica biserica = new Biserica.Builder().setNume("Nume: Biserica1").setLocatie("Locatie: Locatie1").build();
        
        System.out.println(biserica.toString());
        
    }
}