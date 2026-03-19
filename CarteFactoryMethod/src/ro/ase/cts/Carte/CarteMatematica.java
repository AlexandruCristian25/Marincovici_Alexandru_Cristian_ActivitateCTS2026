package ro.ase.cts.Carte;

public class CarteMatematica {
    
    public CarteMatematica(String autor, int nrPagini) {
        
        super(autor, nrPagini);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Auror: ").append(super.autor);
        sb.append("Nr pagini: ").append(super.nrPagini);
        
        System.out.println(sb.toString());
        
    }
    
}
