package ro.ase.cts.ContBancar;

public class Facade {

    public static boolean verificaPersoana(boolean areCazier) {

        Banca banca = new Banca();

        if (banca.verificaPersoana(areCazier)) {

            Persoana persoana = new Persoana();

            if (persoana.areCazier(areCazier) && persoana.areAltCont(areCazier)) {
                
                return true;
                
            } else {
                
                return false;
                
            }

        } else {
            
            return false;
            
        }
        
    }

    public static String verificaDisponibilitateBanca(boolean areCazier) {

        Banca banca = new Banca();

        if (banca.verificaPersoana(areCazier)) {

            Persoana persoana = new Persoana();

            if (persoana.areCazier(areCazier) && persoana.areAltCont(areCazier)) {
                
                return "Persoana NU are cazier și NU are alt cont";
                
            } else {
                
                return "Persoana NU îndeplinește condițiile";
                
            }

        } else {
            
            return "Persoana nu este acceptată de bancă";
            
        }
        
    }
    
}