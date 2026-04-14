package ro.ase.cts.Plata;

public class Client {
    
    private String nume;
    private ModulPlata modulPlata;
    
    
    public Client(String nume, ModulPlata modulPlata) {
        
        super();
        this.nume = nume;
        this.modulPlata = modulPlata;
        
    }
    
    public Client(String nume) {
        
        super();
        this.nume = nume;
        this.modulPlata = new Card();
        
    }
    
    public void plateste(double pretMedicament) {
        
        modulPlata.plateste(this.nume, pretMedicament);
        
    }
    
    public String getNume() {
        
        return nume;
        
    }
    
    public void setNume(String nume) {
        
        this.nume = nume;
        
    }
    
    public ModulPlata getModulPlata() {
        
        return modulPlata;
        
    }
    
    public void setModulPlata(ModulPlata modulPlata) {
        
        this.modulPlata = modulPlata;
        
    }
    
}