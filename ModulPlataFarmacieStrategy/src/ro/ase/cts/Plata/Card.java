package ro.ase.cts.Plata;

public class Card implements ModulPlata {
    
    @Override
    public void plateste(String numeClient, double pret) {
        
        System.out.println(numeClient + " plateste cu cardul suma de " + pret + " lei");
        
    }
    
}