package com.example;

import ro.ase.cts.Document.Document;
import ro.ase.cts.Document.Contabil;

public class Main {
    public static void main(String[] args) {
        
        Document document = new Document(213, "Detalii1");
        Contabil contabil = new Contabil(document);
        
        contabil.info();
        contabil.printareDocument();
        
    }
    
}