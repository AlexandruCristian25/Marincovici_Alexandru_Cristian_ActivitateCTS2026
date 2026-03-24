package ro.ase.cts.Main;

import ro.ase.cts.Companie.ICompanie;
import ro.ase.cts.Companie.Companie;
import ro.ase.cts.Companie.CompanieProxy;

public class Main {
    public static void main(String[] args) {
        
        Companie companie = new Companie("Bitdifender", "Locatie 1");
        ICompanie iCompanie = new ICompanie(companie);
        iCompanie.creazaBirou();
        
        CompanieProxy iCompanieProxy = new CompanieProxy(companie);
        iCompanieProxy.creazaBirou();
        
    }
}