package ro.ase.cts.Main;

import ro.ase.cts.PaginaWeb.PaginaWeb;
import ro.ase.cts.PaginaWeb.Decorator;
import ro.ase.cts.PaginaWeb.PaginaWebDecorata;

public class Main {
    public static void main(String[] args) {
        
        PaginaWeb pagina = new PaginaWeb("Site2", 10);
        pagina.afisarePagina();
        
        Decorator paginaWebDecorata = new PaginaWebDecorata(pagina);
        paginaWebDecorata.afisarePagina();
        
    }
    
}