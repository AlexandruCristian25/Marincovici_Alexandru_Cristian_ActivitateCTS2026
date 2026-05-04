package ro.ase.cts.Cafenea;

public class Persoana implements Observer {

    private String numePersoana;

    public Persoana(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numePersoana + " a primit mesajul: " + mesaj);
    }
    
}