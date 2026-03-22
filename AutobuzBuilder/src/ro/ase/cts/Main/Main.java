package ro.ase.cts.Main;

import ro.ase.cts.Autobuz.AutobuzLinie;
//import ro.ase.cts.AutobuzLinie.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        
        AutobuzLinie autobuzLinie = new AutobuzLinie.Autobuz().setLinie(13).setStatie("Statie1").build();
        
        System.out.println(autobuzLinie.toString());
        
    }
}