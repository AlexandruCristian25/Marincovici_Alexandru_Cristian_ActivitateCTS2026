package ro.ase.cts.Main;

import ro.ase.cts.Telefon.RezervareTelefon;

public class Main {

    public static void main(String[] args) {

        RezervareTelefon rezervareTelefon =
                new RezervareTelefon.Builder()
                        .setMarcaTelefon("Samsung")
                        .setPret(3500)
                        .setNumeClient("Popescu")
                        .build();

        System.out.println(rezervareTelefon.toString());

    }
    
}