package ro.ase.cts.Hotel;

public class CazareHotel extends Hotel {
    
    public CazareHotel(int nrCamera) {
        super(nrCamera);
    }
    
    @Override
    public void cazareHotel() {
        System.out.println("A fost rezervata cazarea pentru camera de hotel " + nrCamera);
    }
    
    @Override
    public void rezervarePachet() {
    }
    
    @Override
    public void achitarePachet() {
        System.out.println("S-a achitat pachetul pentru camera hotel " + nrCamera);
    }
    
}