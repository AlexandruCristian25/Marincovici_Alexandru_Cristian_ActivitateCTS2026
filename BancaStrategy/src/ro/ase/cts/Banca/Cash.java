package ro.ase.cts.Banca;

public class Cash implements MetodaPlata {
    
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste cash suma de " + sumaPlata + " lei");
    }
    
}