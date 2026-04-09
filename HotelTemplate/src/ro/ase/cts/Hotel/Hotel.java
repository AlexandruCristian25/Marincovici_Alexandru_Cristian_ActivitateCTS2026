package ro.ase.cts.Hotel;

public abstract class Hotel {
    
    protected int nrCamera;
    
    public Hotel(int nrCamera) {
        super();
        this.nrCamera = nrCamera;
    }
    
    public abstract void cazareHotel();
    public abstract void rezervarePachet();
    public abstract void achitarePachet();
    
    public final void vindePachet() {
        cazareHotel();
        rezervarePachet();
        achitarePachet();
    }
    
}