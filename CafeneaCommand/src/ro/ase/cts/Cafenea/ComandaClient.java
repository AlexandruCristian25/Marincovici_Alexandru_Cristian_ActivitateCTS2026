package ro.ase.cts.Cafenea;

public class ComandaClient implements Command {
    
    private Client client;
    
    public ComandaClient(Client client) {
        
        super();
        this.client = client;
        
    }
    
    @Override
    public void executa() {
        
        client.comanda();
        
    }
    
}