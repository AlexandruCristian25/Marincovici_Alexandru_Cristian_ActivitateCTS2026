package ro.ase.cts.Prajitura;



public abstract class Decorator implements IPrajitura {
    
    protected IPrajitura prajitura;
    
    public Decorator(IPrajitura prajitura) {
        
        this.prajitura = prajitura;
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        prajitura.afiseazaInfo();
        System.out.println("Editie speciala");
        
    }
    
}