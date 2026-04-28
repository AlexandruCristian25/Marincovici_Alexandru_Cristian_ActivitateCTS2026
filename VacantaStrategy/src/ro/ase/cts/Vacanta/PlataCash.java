package ro.ase.cts.Vacanta;

public class PlataCash implements TipPlata {

    @Override
    public void plateste(String numeClient, double suma) {

        System.out.println(numeClient + " plateste cash suma de " + suma + " lei");

    }

}