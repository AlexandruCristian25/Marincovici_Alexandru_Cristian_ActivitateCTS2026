package ro.ase.cts.Cafenea;

public class Client {
    
    
    public void comanda() {
        
        System.out.println("Clientul a plasat o comandă.");
        
    }
    
    public void invoca(Command command) {
        
        command.executa();
        
    }
    
}