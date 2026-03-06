package ro.ase.cts.Carte;

public class RezervareCarte implements Prototype2, Cloneable {

    private String titlu;
    private String autor;
    private int nrPagini;

    public RezervareCarte(String titlu, String autor, int nrPagini) {
        
        if(titlu == null || titlu.length() < 3) {
            
            throw new IllegalArgumentException("Titlu invalid");
            
        }

        if(autor == null || autor.length() < 3) {
            
            throw new IllegalArgumentException("Autor invalid");
            
        }

        if(nrPagini <= 0) {
            
            throw new IllegalArgumentException("Numar pagini invalid");
            
        }

        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        
    }

    @Override
    public Prototype2 copiaza() {
        try {
            
            return (Prototype2) super.clone();
            
        } catch (CloneNotSupportedException e) {
            
            throw new RuntimeException(e);
            
        }
        
    }

    @Override
    public String toString() {
        return "RezervareCarte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", nrPagini=" + nrPagini +
                '}';
    }
    
}