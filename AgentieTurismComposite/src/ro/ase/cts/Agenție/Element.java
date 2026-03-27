package ro.ase.cts.Agentie;

public class Element implements Optiune {
    
    private String nume;
    public Item(String nume) {
        
        this.nume = nume;
        
    }
    
    @Override
    public void StergeNod(Optiune optiune) throws Exception {
        
        throw new Exception("Implementare neefectuata");
        
    }
    
    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        
        throw new Exception("Implementare neefectuata");
        
    }
    
    @Override
    public void getNod(int Index) throws Exception {
        
        throw new Exception("Implementare neefectuata");
        
    }
    
    @Override
    public void descriere() {
        
        System.out.println("Element: " + nume);
        
    }
    
}