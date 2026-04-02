package ro.ase.cts.Main;

import ro.ase.cts.Companie.Companie;
import ro.ase.cts.Companie.ICompanie;
import ro.ase.cts.Companie.CompanieProxy;
import ro.ase.cts.Companie.TipCompanie;

public class Main {
    public static void main(String[] args) {
        
        Companie companie = new Companie("Bitdefender", "Locatie 1");
        
        ICompanie iCompanie = new TipCompanie(companie);
        iCompanie.creazaBirou();
        
        ICompanie iCompanieProxy = new CompanieProxy(companie);
        iCompanieProxy.creazaBirou();
        
    }
    
}