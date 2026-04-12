package ro.ase.cts.Masina;

public class MasinaHiybrid implements TipMasina {
    
    @Override
    public void conduce(String numeSofer, int nrKilometri) {
        System.out.println(numeSofer + " conduce o masina hibrid pe " + nrKilometri + " km.");
    }
    
}