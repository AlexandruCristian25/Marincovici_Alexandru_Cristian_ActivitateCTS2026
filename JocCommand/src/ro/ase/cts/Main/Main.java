package ro.ase.cts.Main;

import ro.ase.cts.Joc.Command;
import ro.ase.cts.Joc.PachetJoc;
import ro.ase.cts.Joc.RezervaComanda;
import ro.ase.cts.Joc.VanzareComanda;
import ro.ase.cts.Joc.Operator;
import ro.ase.cts.Joc.PachetJocConcret;

public class Main {
    public static void main(String[] args) {
        
        PachetJoc pachet = new PachetJocConcret(18);

        Operator operator = new Operator();
        
        Command vanzare = new VanzareComanda(pachet);
        Command rezervare = new RezervaComanda(pachet);

        operator.invoca(rezervare);
        operator.invoca(vanzare);
        
    }
    
}