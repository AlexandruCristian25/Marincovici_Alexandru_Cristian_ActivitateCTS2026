package ro.ase.cts.Main;

import ro.ase.cts.Agentie.Operator;
import ro.ase.cts.Agentie.Pachet;
import ro.ase.cts.Agentie.Facade;

public class Main {
    public static void main(String[] args) {
        
        int codPachet = 6;
        
        System.out.println(Facade.verificaDisponibilitatePachet(codPachet));
        
    }
    
}