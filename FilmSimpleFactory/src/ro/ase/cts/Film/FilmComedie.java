package ro.ase.cts.Film;

public class FilmComedie extends Film{

    public FilmComedie(int nrActori, double pretBilet) {

        super(nrActori, pretBilet);

    }

    @Override
    public void afiseazaInfo() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nr Actori : ").append(nrActori);
        sb.append("Pret bilet: ").append(pretBilet);

        System.out.println(sb.toString());

    }
}
