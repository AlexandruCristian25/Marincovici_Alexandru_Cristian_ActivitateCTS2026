package ro.ase.cts.Electronice;

public class Laptop implements TipElectronice {
    
    @Override
    public void utilizare(String nume, int ram) {
        
        System.out.println("Utilizatorul " + nume + " foloseste laptopul ce are " + ram + " RAM");
        
    }
    
}