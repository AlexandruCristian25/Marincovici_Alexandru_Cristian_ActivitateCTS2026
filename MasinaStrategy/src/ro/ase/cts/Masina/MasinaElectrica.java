package ro.ase.cts.Masina;

public class MasinaElectrica implements TipMasina {
    
    @Override
    public void conduce(String numeSofer, int nrKilometri) {
        System.out.println(numeSofer + " conduce un BMW electric pe " + nrKilometri + " km.");
    }
    
}