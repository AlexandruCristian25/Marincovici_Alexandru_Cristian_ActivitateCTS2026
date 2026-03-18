package ro.ase.cts.Main;

import ro.ase.cts.AutobuzLinie.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        
        AutobuzLinie autobuzLinie = new AutobuzLinie.Builder().setLinie(13).setStatie("Statie1").build();
        
        System.out.println(autobuzLinie.toString());
        
    }
}