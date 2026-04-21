package ro.ase.cts.Magazin;

public interface IMagazin {
    
    void adaugaNod(IMagazin magazin);
    void stergeNod(IMagazin magazin);
    IMagazin getNod(int index);
    void descriere();
    
}