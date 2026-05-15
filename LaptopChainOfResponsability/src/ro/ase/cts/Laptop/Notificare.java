package ro.ase.cts.Laptop;

public abstract class Notificare {

    protected Notificare notificare;

    public Notificare getNotificare() {
        return notificare;
    }

    public void setNotificare(Notificare notificare) {
        this.notificare = notificare;
    }

    public abstract void notifica(Utilizator utilizator, String mesaj);
}
