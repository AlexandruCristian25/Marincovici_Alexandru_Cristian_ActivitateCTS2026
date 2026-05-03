package ro.ase.cts.Document;

public class Contabil implements IDocument {
    
    private Document document;
    
    public Document getDocument() {
        return document;
    }
    
    public void setDocument(Document document) {
        this.document = document;
    }
    
    public Contabil(Document document) {
        this.document = document;
    }
    
    @Override
    public void info() {
        System.out.println("Document semnat de contabil");
    }
    
    @Override
    public void printareDocument() {
        System.out.println(document.getDetalii() + " a fost printat");
    }
    
}