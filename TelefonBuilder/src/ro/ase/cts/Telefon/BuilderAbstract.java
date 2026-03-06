package ro.ase.cts.Telefon;

public interface BuilderAbstract {

    BuilderAbstract setMarcaTelefon(String marcaTelefon);
    BuilderAbstract setPret(double pret);
    BuilderAbstract setNumeClient(String numeClient);
    RezervareTelefon build();
    
}