import java.util.Date;

public class Enseignent extends Abonne
{
    int N_immat;
    String departement;
    String grade;
    Date dateRecrutement;
    int nbr_these;

    public Enseignent(int n_identification, String nom, String prenom, String adress, int n_immat, String departement, String grade, Date dateRecrutement) {
        super(n_identification, nom, prenom, adress);
        N_immat = n_immat;
        this.departement = departement;
        this.grade = grade;
        this.dateRecrutement = dateRecrutement;

    }
}
