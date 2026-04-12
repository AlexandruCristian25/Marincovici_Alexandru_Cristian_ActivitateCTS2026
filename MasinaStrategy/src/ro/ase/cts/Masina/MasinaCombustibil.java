package ro.ase.cts.Masina;

public class MasinaCombustibil implements TipMasina {
    
    @Override
    public void conduce(String numeSofer, int nrKilometri) {
        System.out.println(numeSofer + " conduce un Mercedes pe combustibil pe " + nrKilometri + " km.");
    }
    
}