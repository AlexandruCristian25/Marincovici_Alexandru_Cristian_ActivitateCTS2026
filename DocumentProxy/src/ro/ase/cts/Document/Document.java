package ro.ase.cts.Document;

public class Document {
    
    private int nrDocument;
    private String detalii;
    
    public Document(int nrDocument, String detalii) {
        
        super();
        this.nrDocument = nrDocument;
        this.detalii = detalii;
        
    }
    
    public int getNrDocument() {
        
        return nrDocument;
        
    }
    
    public void setNrDocument(int nrDocument) {
        
        this.nrDocument = nrDocument;
        
    }
    
    public String getDetalii() {
        
        return detalii;
        
    }
    
    public void setDetalii(String detalii) {
        
        this.detalii = detalii;
        
    }
    
    @Override
    public String toString() {
        
        return "Document [nrDocument=" + nrDocument + ", detalii=" + detalii + "]";
        
    }
    
}