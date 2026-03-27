package ro.ase.cts.Main;

import ro.ase.cts.Oras.PachetTransport;
import ro.ase.cts.Oras.Oras;
import ro.ase.cts.Oras.PachetProxy;

public class Main {
    public static void main(String[] args) {
        
        Oras oras = new Oras("Tokyo", "Japonia");
        PachetTransport pachetTransport = new PachetTransport(oras);
        pachetTransport.rezervare();
        
        ProxyPachet pachetTransportProxy = new ProxyPachet(oras);
        pachetTransportProxy.rezervare();
        
    }
}