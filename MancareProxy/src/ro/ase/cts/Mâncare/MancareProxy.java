package ro.ase.cts.Mancare;

public class MancareProxy implements IMancare {
    
    private IMancare mancare;
    
    public MancareProxy(IMancare mancare) {
        
        this.mancare = new IMancare(mancare);
        
    }
    
    @Override
    public void descriere() {
        
        mancare.descriere();
        
    }
    
    @Override
    public void gatesteMancare() {
        
        if(mancare.getMancare().getPret >= 12.99) {
            
            mancare.gatesteMancare();
            
        } else {
            
            System.out.println("Mancarea nu a fost gatita deoarece " + mancare.getMancare().getNume() + "iar pretul este de " + mancare.getMancare().getPret() + " lei.");
            
        }
        
    }
    
}