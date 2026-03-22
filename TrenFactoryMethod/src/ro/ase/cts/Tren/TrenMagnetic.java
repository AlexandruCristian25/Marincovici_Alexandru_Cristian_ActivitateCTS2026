package ro.ase.cts.Tren;

public class TrenMagnetic extends Tren {
    
    public TrenMagnetic(String marca, int nrVagoane) {
        
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