public class LaptopOffice extends Laptop{
    
    public LaptopOffice(String marca, float pret) {
        
        super(marca, pret);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Marca laptop office" + marca + " are pretul de " + pret + " lei");
        
    }
    
}