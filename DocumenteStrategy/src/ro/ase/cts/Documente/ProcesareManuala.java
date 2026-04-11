package ro.ase.cts.Documente;

public class ProcesareManuala implements IProcesare {
    
    @Override
    public void verificaDocumente(String cnp, String actInfiintare) {
        System.out.println("Documentele au fost procesate manual: " + cnp + " - " + actInfiintare);
    }
    
}