package ro.ase.cts.Bilet;

public class PlataCard implements TipPlata {

    @Override
    public void plata(String numeClient, int suma) {

        System.out.println("Clientul " + numeClient +
                " plateste cu cardul biletul de autobuz suma de " + suma + " lei");

    }

}
