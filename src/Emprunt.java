import java.util.Date;

public class Emprunt {
    int N_identification;
    int N_inventaire;
    Date date_emprunt;
    long pinalite;
    Abonne listAtt[];

    public Emprunt(int n_identification, int n_inventaire, Date date_emprunt) {
        N_identification = n_identification;
        N_inventaire = n_inventaire;
        this.date_emprunt = date_emprunt;

    }
}
