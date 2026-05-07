package ro.ase.cts.Document;

public abstract class Decorator implements IDocument {
    
    protected Document document;
    
    public Decorator(Document document) {
        this.document = document;
    }
    
    @Override
    public void printeazaDocument() {
        document.printeazaDocument();
        System.out.println("O zi buna!");
    }
}
