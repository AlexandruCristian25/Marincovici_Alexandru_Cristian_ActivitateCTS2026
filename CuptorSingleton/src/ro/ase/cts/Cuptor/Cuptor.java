package ro.ase.cts.Cuptor;

public class Cuptor {
    
    private int timpGatire;
    private float gradeGatire;
    private static Cuptor instance = null;
    
    private Cuptor(int timpGatire, float gradGatire) {
        
        this.timpGatire = timpGatire;
        this.gradGatire = gradGatire;
        
    }
    
    public int getTimpGatire() {
        
        this.timpGatire = timpGatire;
        
    }
    
    public void setTimpGatire(int timpGatire) {
        
        this.timpGatire = timpGatireNou;
        
    }
    
    public floar getGradeGatire() {
        
        this.gradGatire = gradGatire;
        
    }
    
    public void setGradGatire(int gradGatire) {
        
        this.gradGatire = gradGatireNou;
        
    }
    
    public static synchronized Cuptor getInstance() {
        
        if(instance != null) {
            
            instance = new Cuptor(timpGatire, gradeGatire);
            
        }
        
        return instance;
        
    }
    
}