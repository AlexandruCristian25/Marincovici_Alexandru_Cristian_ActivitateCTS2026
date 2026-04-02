package ro.ase.cts.Mancare;

public class FelMancare implements IMancare {
    
    private Mancare mancare;
    
    public FelMancare(Mancare mancare) {
        this.mancare = mancare;
    }
    
    public Mancare getMancare() {
        return mancare;
    }
    
    public void setMancare(Mancare mancare) {
        this.mancare = mancare;
    }
    
    @Override
    public void descriere() {
        System.out.println("Fel de mancare principal");
    }
    
    @Override
    public void gatesteMancare() {
        System.out.println(mancare.getNume() + " a fost preparat");
    }
    
}