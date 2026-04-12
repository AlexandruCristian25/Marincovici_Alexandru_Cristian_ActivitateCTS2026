package ro.ase.cts.Loc;

public interface State {
    
    void rezervareLoc(Loc loc);
    void ocupaLoc(Loc loc);
    void eliberareLoc(Loc loc);
    
}