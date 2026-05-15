package ro.ase.cts.Bilet;

public class PlataSMS implements TipPlata {

    @Override
    public void plata(String numeClient, int suma) {

        System.out.println("Clientul " + numeClient +
                " plateste prin SMS biletul de autobuz suma de " + suma + " lei");

    }

}
