package ro.ase.cts.Banca;

public class PayPal implements MetodaPlata {
    
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste prin PayPal suma de " + sumaPlata + " lei");
    }
    
}