import java.util.ArrayList;
import java.util.Date;

public class Livre extends Document
{
    String titre;
    String editeur;
    Date date_edition ;
    String specialite;
    ArrayList<Auteur> auteurs;

    public Livre(int n_isbn, int n_inventaire, String titre, String editeur, Date date_edition, String specialite, ArrayList<Auteur> auteurs) {
        super(n_isbn, n_inventaire);
        this.titre = titre;
        this.editeur = editeur;
        this.date_edition = date_edition;
        this.specialite = specialite;
        this.auteurs = auteurs;
    }

    public String getTitre() {
        return titre;
    }
}
