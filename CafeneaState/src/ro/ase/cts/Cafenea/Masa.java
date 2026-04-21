package ro.ase.cts.Cafenea;

public class Masa {

    private int nrMasa;
    private Stare stare;

    public Masa(int nrMasa) {
        super();
        this.nrMasa = nrMasa;
        stare = new MasaLibera(); // FIX
    }

    public void rezervaMasa() {

        if (this.stare instanceof MasaLibera) {

            System.out.println("Masa cu numarul " + nrMasa + " este rezervata");
            stare = new MasaRezervata(); // FIX

        } else {

            System.out.println("Masa cu numarul " + nrMasa + " nu este rezervata");

        }

    }

    public void ocupaMasa() {

        if (this.stare instanceof MasaLibera) {

            System.out.println("Masa cu numarul " + nrMasa + " este ocupata");
            stare = new MasaOcupata(); // FIX

        } else {

            System.out.println("Masa cu numarul " + nrMasa + " nu este ocupata");

        }

    }
    
}