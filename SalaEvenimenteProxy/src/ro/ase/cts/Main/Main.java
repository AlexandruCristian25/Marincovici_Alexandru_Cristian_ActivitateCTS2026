package ro.ase.cts.Main;

import ro.ase.cts.SalaEvenimente.PachetTransport;
import ro.ase.cts.SalaEvenimente.Persoana;
import ro.ase.cts.SalaEvenimente.ProxyPachet;

public class Main {
    public static void main(String[] args) {

        Persoana persoana = new Persoana("Alex", 14);

        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervarePachet();

        ProxyPachet pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervarePachet();

    }
    
}