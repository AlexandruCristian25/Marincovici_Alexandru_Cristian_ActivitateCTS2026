package ro.ase.cts.Main;

public class Main {
    public static void main(String[] args) {
        
        private static void printeazaRezervare(ICabana iCabana) {
            
            System.out.println("Pentru client: ");
            iCabana.info();
            System.out.println("Pentru sofer: ");
            iCabana.rezervareCabana();
            
        }
        
        ICabana cazareCabana = new CazareCabana();
        printeazaRezervare(cazareCabana);
        
        System.out.println("Se doreste inchirierea unei masini");
        
        System.out.println("Masina inchiriata");
        Masina masina = new Masina("Audi", "Popescu");
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
        System.out.println(masina.toString());
        
    }
}