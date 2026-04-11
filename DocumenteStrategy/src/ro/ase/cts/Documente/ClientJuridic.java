package ro.ase.cts.Documente;

public class ClientJuridic {
    
    private String actInfiintare;
    private IProcesare procesare;
    
    public ClientJuridic(String actInfiintare, IProcesare procesare) {
        this.actInfiintare = actInfiintare;
        this.procesare = procesare;
    }
    
    public ClientJuridic(String actInfiintare) {
        this.actInfiintare = actInfiintare;
        this.procesare = new ProcesareElectronica();
    }
    
    public String getActInfiintare() {
        return actInfiintare; 
    }
    
    public void setActInfiintare(String actInfiintare) {
        this.actInfiintare = actInfiintare;
    }
    
    public IProcesare getProcesare() {
        return procesare; 
    }
    
    public void setProcesare(IProcesare procesare) {
        this.procesare = procesare;
    }
    
    public void verificaDocumente(String dovadaPlata) {
        procesare.verificaDocumente(this.actInfiintare, dovadaPlata);
    }
    
}