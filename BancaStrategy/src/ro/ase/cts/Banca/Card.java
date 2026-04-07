package ro.ase.cts.Banca;

public class Card implements MetodaPlata {
    
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste cu cardul suma de " + sumaPlata + " lei");
    }
    
}