package ro.ase.cts.Main;

import ro.ase.cts.Dictionar.Dictionar;

public class Main {
    public static void main(String[] args) {
        
        DictionarFactory dictionarFactory = new DictionarFactory();
        
        Dictionar englez = dictionarFactory.getDictionar(TipDictionar.Englez, "Editura1", 45.99);
        Dictionar francez = dictionarFactory.getDictionar(TipDictionar.Francez, "Editura2", 57.99);
        Dictionar japonez = dictionarFactory.getDictionar(TipDictionar.Japonez, "Editura3", 78.99);
        
        englez.afiseazaInfo();
        francez.afiseazaInfo();
        japonez.afiseazaInfo();
        
    }
}