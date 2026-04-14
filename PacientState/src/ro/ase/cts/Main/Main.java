package ro.ase.cts.Main;

import ro.ase.cts.Pacient.Pacient;

public class Main {
    public static void main(String[] args) {
        
        Pacient pacient = new Pacient("Ionescu");
        pacient.externarePacient();
        pacient.subObservatiePacient();
        pacient.internarePacient();
        pacient.internarePacient();
        pacient.subObservatiePacient();
        pacient.externarePacient();
        
    }
    
}