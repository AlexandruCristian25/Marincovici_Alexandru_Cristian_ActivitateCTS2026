public class LaptopGaming extends Laptop{
    
    public LaptopGaming(String marca, float pret) {
        
        super(nume, pret);
        
    }
    
    @Override
    public void afiseazaInfo() {
        
        System.out.println("Marca laptop gaming" + marca + " are pretul de " + pret + " lei");
        
    }
    
}