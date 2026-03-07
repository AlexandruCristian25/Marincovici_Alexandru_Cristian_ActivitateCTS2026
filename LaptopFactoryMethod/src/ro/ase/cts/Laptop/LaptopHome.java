public class LaptopHome extends Laptop{
    
    public LaptopHome(String marca, float pret) {
        
        super(marca, pret);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Marca laptop home" + marca + " are pretul de " + pret + " lei");
        
    }
    
}