package ro.ase.cts.Cafenea;

public class Main {
    public static void main(String[] args) {
        MasaFactory factory = new MasaFactory();

        IMasa masa1 = factory.getMasa(1);
        IMasa masa2 = factory.getMasa(2);
        IMasa masa3 = factory.getMasa(1);

        Bon bon1 = new Bon(101, 45.5);
        Bon bon2 = new Bon(102, 67.0);
        Bon bon3 = new Bon(103, 89.9);

        masa1.tipareste(bon1);
        masa2.tipareste(bon2);
        masa3.tipareste(bon3);
        
    }
}