package ro.ase.cts.Hotel;

public class RezervarePachet extends Hotel {
    
    public RezervarePachet(int nrCamera) {
        super(nrCamera);
    }
    
    @Override
    public void cazareHotel() {
        System.out.println("A fost rezervata cazarea pentru camera de hotel " + nrCamera);
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