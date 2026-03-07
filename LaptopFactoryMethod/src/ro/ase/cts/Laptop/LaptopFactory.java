public class LaptopFactory {
    
    public static Laptop afiseazaLaptop(TipLaptop tipLaptop, String marca, float pret) {
        
        switch(tipLaptop) {
            
            case LaptopGaming:
                return LaptopGaming(marca, pret);
            case LaptopOffice:
                return LaptopOffice(marca, pret);
            case LaptopHome:
                return LaptopHome(marca, pret);
            default:
                throw IllegalArgumentException("Tip laptop inexistent: " + tipLaptop);
            
        }
        
    }
    
}