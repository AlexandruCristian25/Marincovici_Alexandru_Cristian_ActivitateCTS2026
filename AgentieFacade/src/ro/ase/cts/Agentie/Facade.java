package ro.ase.cts.Agentie;

public class Facade {
    
    public static boolean verificaPachet(int codPachet) {
        
        Pachet pachet = new Pachet();
        if(pachet.verificarePachet(codPachet)) {
            
            Operator operator = new Operator();
            if(operator.pachetCuOferta(codPachet) && operator.pachetCuDiscount(codPachet)) {
                
                return true;
                
            } else {
                
                return false;
                
            }
            
        } else {
            
            return false;
        }
        
    }
    
    public static String verificaDisponibilitatePachet(int codPachet) {
        
        Pachet pachet = new Pachet();
        if(pachet.verificarePachet(codPachet)) {
            
            Operator operator = new Operator();
            if(operator.pachetCuOferta(codPachet) && operator.pachetCuDiscount(codPachet)) {
                
                return "Pachet cu oferta";
                
            } else {
                
                return "Pachetul are discount";
                
            }
            
        } else {
            
            return "Pachet simplu";
            
        }
        
    }
    
}