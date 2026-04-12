package ro.ase.cts.Nunta;

public class PachetNunta implements IPachet {
    
    private Mireasa mireasa;
    
    public Mireasa getMireasa() {
        return mireasa;
    }
    
    public void setMireasa(Mireasa mireasa) {
        this.mireasa = mireasa;
    }
    
    public PachetNunta(Mireasa mireasa) {
        this.mireasa = mireasa;
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Pachetul pentru nunta este achizitionat");
    }
    
}