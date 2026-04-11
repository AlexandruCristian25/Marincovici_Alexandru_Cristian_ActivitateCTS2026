package ro.ase.cts.Main;

import ro.ase.cts.Documente.ProcesareElectronica;
import ro.ase.cts.Documente.ProcesareManuala;
import ro.ase.cts.Documente.ClientFizic;
import ro.ase.cts.Documente.ClientJuridic;

public class Main {
    public static void main(String[] args) {
        
        ClientFizic clientFizic = new ClientFizic("1234567890123");
        ClientJuridic clientJuridic = new ClientJuridic("RO123456");
        
        clientFizic.setProcesare(new ProcesareManuala());
        clientFizic.verificaDocumente("Adeverinta venit");
        
        clientJuridic.setProcesare(new ProcesareElectronica());
        clientJuridic.verificaDocumente("Dovada plata");
        
    }
    
}