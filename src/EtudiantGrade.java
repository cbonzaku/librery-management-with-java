public class EtudiantGrade extends Abonne
{
    int N_inscreption;
    String specialite;

    public EtudiantGrade(int n_identification, String nom, String prenom, String adress, int n_inscreption, String specialite) {
        super(n_identification, nom, prenom, adress);
        N_inscreption = n_inscreption;
        this.specialite = specialite;
    }
}
