package ro.ase.cts.Vacanta;

public class PlataCard implements TipPlata {

    @Override
    public void plateste(String numeClient, double suma) {

        System.out.println(numeClient + " plateste cu cardul suma de " + suma + " lei");

    }

}