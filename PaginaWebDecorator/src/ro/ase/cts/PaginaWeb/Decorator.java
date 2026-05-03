package ro.ase.cts.PaginaWeb;

import ro.ase.cts.PaginaWeb.PaginaWeb;

public abstract class Decorator implements ro.ase.cts.PaginaWeb.IPaginaWeb {
    
    protected PaginaWeb pagina;
    
    public Decorator(PaginaWeb pagina) {
        
        this.pagina = pagina;
        
    }
    
    @Override
    public void afisarePagina() {
        
        pagina.afisarePagina();
        System.out.println("Procesare in curs...");
        
    }
    
}