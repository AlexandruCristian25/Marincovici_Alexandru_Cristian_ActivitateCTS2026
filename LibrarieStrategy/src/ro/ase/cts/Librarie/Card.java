package ro.ase.cts.Librarie;

public class Card implements TipPlata {

    @Override
    public void plateste(String numeClient, double suma) {

        System.out.println(numeClient + " plateste cu cardul pentru cartea Y cu suma de " + suma + " lei");

    }

}