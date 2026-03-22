package ro.ase.cts.Cuptor;

public class Cuptor {
    
    private static int timpGatire;
    private static float gradeGatire;
    private static Cuptor instance = null;
    
    public Cuptor(int timpGatire, float gradeGatire) {
        
        this.timpGatire = timpGatire;
        this.gradeGatire = gradeGatire;
        
    }

    public int getTimpGatire() {
        return this.timpGatire;
    }

    public void setTimpGatire(int timpGatire) {
        this.timpGatire = timpGatire;
    }

    public float getGradeGatire() {
        return this.gradeGatire;
    }

    public void setGradeGatire(float gradeGatire) {
        this.gradeGatire = gradeGatire;
    }

    public static synchronized Cuptor getInstance() {
        
        if(instance != null) {
            
            instance = new Cuptor(timpGatire, gradeGatire);
            
        }
        
        return instance;
        
    }
    
}