package ro.ase.cts.Documente;

public class ClientFizic {
    
    private String cnp;
    private IProcesare procesare;
    
    public ClientFizic(String cnp, IProcesare procesare) {
        this.cnp = cnp;
        this.procesare = procesare;
    }
    
    public ClientFizic(String cnp) {
        this.cnp = cnp;
        this.procesare = new ProcesareElectronica();
    }
    
    public String getCnp() {
        return cnp; 
    }
    
    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
    public IProcesare getProcesare() {
        return procesare; 
    }
    
    public void setProcesare(IProcesare procesare) {
        this.procesare = procesare;
    }
    
    public void verificaDocumente(String adeverinta) {
        procesare.verificaDocumente(this.cnp, adeverinta);
    }
    
}