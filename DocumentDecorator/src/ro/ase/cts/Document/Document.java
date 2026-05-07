package ro.ase.cts.Document;

public class Document implements IDocument {
    
    private int codDocument;
    private String informatii;
    
    public Document(int codDocument, String informatii) {
        
        super();
        this.codDocument = codDocument;
        this.informatii = informatii;
        
    }
    
    public int getCodDocument() {
        
        return codDocument;
        
    }
    
    public void setCodDocument(int codDocument) {
        
        this.codDocument = codDocument;
        
    }
    
    public String getInformatii() {
        
        return informatii;
        
    }
    
    public void setInformatii(String informatii) {
        
        this.informatii = informatii;
        
    }
    
    public void printeazaDocument() {
        
        System.out.println("Documentul cu codul " + codDocument + " are informatiile " + informatii);
        
    }
    
}