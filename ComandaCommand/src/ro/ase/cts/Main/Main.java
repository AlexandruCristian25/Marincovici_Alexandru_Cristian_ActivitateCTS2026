package ro.ase.cts.Main;

import ro.ase.cts.Comanda.Operator;
import ro.ase.cts.Comanda.RezervareComanda;
import ro.ase.cts.Comanda.Command;
import ro.ase.cts.Comanda.VanzareComanda;
import ro.ase.cts.Comanda.PachetComanda;

public class Main {

    public static void main(String[] args) {
    	
        PachetComanda pachet = new PachetComanda(23);

        Operator operator = new Operator();
        
        Command vanzare = new VanzareComanda(pachet);
        Command rezervare = new RezervareComanda(pachet);

        operator.invoca(rezervare);
        operator.invoca(vanzare);
    	
    }
	
}