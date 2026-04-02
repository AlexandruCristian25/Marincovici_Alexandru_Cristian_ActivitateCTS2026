package ro.ase.cts.Mancare;

public class MancareProxy implements IMancare {
    
    private IMancare mancare;
    
    public MancareProxy(IMancare mancare) {
        this.mancare = mancare;
    }
    
    @Override
    public void descriere() {
        mancare.descriere();
    }
    
    @Override
    public void gatesteMancare() {
        
        if(mancare instanceof FelMancare) {
            FelMancare fel = (FelMancare) mancare;
            
            if(fel.getMancare().getPret() >= 12.99) {
                mancare.gatesteMancare();
            } else {
                System.out.println("Mancarea nu a fost gatita deoarece " 
                        + fel.getMancare().getNume() 
                        + " iar pretul este de " 
                        + fel.getMancare().getPret() + " lei.");
            }
            
        }
        
    }
    
}