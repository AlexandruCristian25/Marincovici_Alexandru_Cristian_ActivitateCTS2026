package ro.ase.cts.Main;

import ro.ase.cts.Autobuz.Autobuz;
import ro.ase.cts.Autobuz.AutobuzProxy;
import ro.ase.cts.Autobuz.Sofer;

public class Main {
    public static void main(String[] args) {

        Sofer sofer = new Sofer("Popescu", "12:00-20:00");

        Autobuz autobuz = new Autobuz(sofer);
        autobuz.afiseazaInfo();

        AutobuzProxy proxy = new AutobuzProxy(sofer);
        proxy.afiseazaInfo();
    }
}
