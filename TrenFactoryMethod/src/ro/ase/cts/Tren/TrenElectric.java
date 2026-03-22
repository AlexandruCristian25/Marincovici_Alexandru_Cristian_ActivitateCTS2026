package ro.ase.cts.Tren;

public class TrenElectric extends Tren {
    
    public TrenElectric(String marca, int nrVagoane) {
        
        super(marca, nrVagoane);
        
    }
    
    @Override
    public void afiseazaInfo() {

        StringBuilder sb = new StringBuilder();
        sb.append("Marca : ").append(marca);
        sb.append("Nr vagoane: ").append(nrVagoane);

        System.out.println(sb.toString());

    }
    
}