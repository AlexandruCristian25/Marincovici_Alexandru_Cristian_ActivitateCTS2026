package ro.ase.cts.Joc;

public abstract class BuilderAbstract {
    public abstract BuilderAbstract adaugaScut();
    public abstract BuilderAbstract adaugaArma();
    public abstract BuilderAbstract adaugaMagie();
    public abstract RezervareJoc build();
}