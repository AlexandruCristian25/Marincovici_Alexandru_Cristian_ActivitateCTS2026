package ro.ase.cts.Invitatie;

public abstract class Decorator implements IInvitatie {
    
    protected IInvitatie invitatie;
    
    public Decorator(IInvitatie invitatie) {
        this.invitatie = invitatie;
    }
    
    @Override
    public void printareInvitatie() {
        invitatie.printareInvitatie();
        System.out.println("Petrecere frumoasa!");
    }
    
}