package ro.ase.cts.Documente;

public class ProcesareElectronica implements IProcesare {
    
    @Override
    public void verificaDocumente(String cnp, String actInfiintare) {
        System.out.println("Documentele au fost procesate automat: " + cnp + " - " + actInfiintare);
    }
    
}