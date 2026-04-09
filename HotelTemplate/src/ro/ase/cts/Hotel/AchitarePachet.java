package ro.ase.cts.Hotel;

public class AchitarePachet extends Hotel {
    
    public AchitarePachet(int nrCamera) {
        super(nrCamera);
    }
    
    @Override
    public void cazareHotel() {
    }
    
    @Override
    public void rezervarePachet() {
        System.out.println("S-a facut rezervarea pentru camera " + nrCamera);
    }
    
    @Override
    public void achitarePachet() {
        System.out.println("S-a achitat pachetul pentru camera hotel " + nrCamera);
    }
    
}