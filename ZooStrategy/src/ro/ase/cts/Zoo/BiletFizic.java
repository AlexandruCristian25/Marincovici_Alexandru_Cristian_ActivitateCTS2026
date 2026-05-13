package ro.ase.cts.Zoo;

public class BiletFizic implements TipBilet {
    
    @Override
    public void rezervare(String numePersoana, String zi) {
        
        System.out.println(numePersoana + " a achizitionat un bilet fizic pentru ziua " + zi);
        
    }
    
}