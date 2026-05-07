package ro.ase.cts.Main;

public class Main {
    public static void main(String[] args) {
        
        IntrareStadion intrareStadion = new IntrareStadion(45);
        intrareStadion.asezareCoada();
        
        IntrareStadion intrareStadion = new IntrareStadion(12);
        intrareStadion.prezentareBilet();
        
        IntrareStadion intrareStadion = new IntrareStadion(27);
        intrareStadion.controlCorporal();
        
        IntrareStadion intrareStadion = new IntrareStadion(70);
        intrareStadion.ocupareLoc();
        
    }
    
}