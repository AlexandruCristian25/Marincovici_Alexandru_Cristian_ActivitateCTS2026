package ro.ase.cts.Main;

import ro.ase.cts.Document.Document;
import ro.ase.cts.Document.Decorator;
import ro.ase.cts.Document.DocumentDecorator;

public class Main {
    public static void main(String[] args) {
        
        Document document = new Document(452, "Informatii");
        document.printeazaDocument();
        
        Decorator documentDecorat = new DocumentDecorator(document);
        documentDecorat.printeazaDocument();
        
    }
}
