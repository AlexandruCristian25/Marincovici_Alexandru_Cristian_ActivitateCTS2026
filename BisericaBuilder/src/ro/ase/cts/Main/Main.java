package ro.ase.cts.Main;

import ro.ase.cts.Biserica.Biserica;

public class Main {
    public static void main(String[] args) {
        
        Biserica biserica = new Biserica.Builder().setNume("Nume: Biserica1").setLocatie("Locatie: Locatie1");
        
        System.out.println(biserica.toString());
        
    }
}