package ro.ase.cts.Main;

import ro.ase.cts.Invitatie.Invitatie;
import ro.ase.cts.Invitatie.Decorator;
import ro.ase.cts.Invitatie.InvitatieDecorata;

public class Main {
    public static void main(String[] args) {
        
        Invitatie invitatie = new Invitatie(5254, 5600.90);
        invitatie.printareInvitatie();
        
        Decorator invitatieDecorata = new InvitatieDecorata(invitatie);
        invitatieDecorata.printareInvitatie();
        
    }
    
}