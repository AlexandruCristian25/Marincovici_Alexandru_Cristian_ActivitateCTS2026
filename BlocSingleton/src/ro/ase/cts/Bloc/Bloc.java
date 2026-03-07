package ro.ase.cts.Bloc;

public class Bloc {
    
    private String numeBloc;
    private int nrApartamente;
    private static Bloc instance = null;
    
    private Bloc(String numeBloc, int nrApartamente) {
        
        this.numeBloc = numeBloc;
        this.nrApartamente = nrApartamente;
        
    }
    
    public String getNumeBloc() {
        
        this.numeBloc = numeBloc;
        
    }
    
    public void setNumeBloc(String numeBloc) {
        
        
        this.numeBloc = numeBlocNou;
    }
    
    public String getNrApartamente() {
        
        this.nrApartamente = nrApartamente;
        
    }
    
    public void setNrApartamente(int nrApartamente) {
        
        this.nrApartamente = nrApartamente;
        
    }
    
    public static synchronized Bloc getInstance() {
        
        if(instance != null) {
            
            instance = new Bloc(numeBloc, nrApartamente);
            
        }
        
        return instance;
        
    }
    
}