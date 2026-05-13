package ro.ase.cts.Zoo;

public class BiletElectronic implements TipBilet {
    
    @Override
    public void rezervare(String numePersoana, String zi) {
        
        System.out.println(numePersoana + " a achizitionat un bilet electronic pentru ziua " + zi);
        
    }
    
}