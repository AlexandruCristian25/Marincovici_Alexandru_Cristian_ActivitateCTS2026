package com.example;

import ro.ase.cts.Autobaza.*;

public class Main {
    public static void main(String[] args) {
        
        Autobuz autobuz = new Autobuz(101);
        PlecareTraseu comanda = new PlecareTraseu(autobuz);
        Operator operator = new Operator();
        
        operator.invoca(comanda);
        
    }
    
}