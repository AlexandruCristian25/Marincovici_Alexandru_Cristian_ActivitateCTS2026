package ro.ase.cts.Masina;

public class Sofer {
    
    private String numeSofer;
    private TipMasina tipMasina;
    private int nrKilometri;
    
    public Sofer(String numeSofer, int nrKilometri) {
        
        super();
        this.numeSofer = numeSofer;
        this.nrKilometri = nrKilometri;
        
    }
    
    public Sofer(String numeSofer) {
        
        super();
        this.numeSofer = numeSofer;
        this.tipMasina = new MasinaElectrica();
        
    }
    
    public String getNumeSofer() {
        return numeSofer;
    }
    
    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }
    
    public TipMasina getTipMasina() {
        return tipMasina;
    }
    
    public void setTipMasina(TipMasina tipMasina) {
        this.tipMasina = tipMasina;
    }
    
    public void conduce(int nrKilometri) {
        
        if (tipMasina != null) {
            
            tipMasina.conduce(numeSofer, nrKilometri);
            
        }
        
    }
    
}