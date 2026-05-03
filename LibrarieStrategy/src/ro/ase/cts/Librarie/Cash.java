package ro.ase.cts.Librarie;

public class Cash implements TipPlata {

    @Override
    public void plateste(String numeClient, double suma) {

        System.out.println(numeClient + " plateste cash pentru cartea X cu suma de " + suma + " lei");

    }

}