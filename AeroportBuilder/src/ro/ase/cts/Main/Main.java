
package ro.ase.cts.Main;

import ro.ase.cts.Aeroport.Bilet;
import ro.ase.cts.Aeroport.BuilderAbstract;

public class Main {

    public static void main(String[] args) {

        BuilderAbstract builder = new Bilet.Builder();

        Bilet bilet = builder
                .setNumePasager("Ion Popescu")
                .setPret(350.5)
                .setNrLoc(89)
                .build();

        System.out.println(bilet);
    }
}
