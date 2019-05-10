import java.util.Date;

public class Employer extends Abonne {
    int N_immat;
    Date dateRecrutement;
    String fonction;

    public Employer(int n_identification, String nom, String prenom, String adress, int N_immat, Date dateRecrutement, String fonction) {
        super(n_identification, nom, prenom, adress);
        this.N_immat = N_immat;
        this.dateRecrutement = dateRecrutement;
        this.fonction = fonction;

    }
}
