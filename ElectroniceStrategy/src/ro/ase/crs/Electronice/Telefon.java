package ro.ase.cts.Electronice;

public class Telefon implements TipElectronice {
    
    @Override
    public void utilizare(String nume, int ram) {
        
        System.out.println("Utilizatorul " + nume + " foloseste telefonul ce are " + ram + " RAM");
        
    }
    
}