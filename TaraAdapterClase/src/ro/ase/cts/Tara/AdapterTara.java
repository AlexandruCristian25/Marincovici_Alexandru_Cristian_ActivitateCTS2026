package ro.ase.cts.Tara;

public class AdapterTara implements ITara {

    private TaraExterna taraExterna;

    public AdapterTara(TaraExterna taraExterna) {
        this.taraExterna = taraExterna;
    }

    @Override
    public void afiseazaTara() {
        taraExterna.showCountry();
    }

    @Override
    public void afiseazaPopulatie() {
        taraExterna.showPopulation();
    }
    
}