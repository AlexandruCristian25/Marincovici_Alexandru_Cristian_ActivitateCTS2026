package ro.ase.cts.Plata;

public class Cash implements ModulPlata {
    
    @Override
    public void plateste(String numeClient, double pret) {
        
        System.out.println(numeClient + " plateste cash suma de " + pret + " lei");
        
    }
    
}