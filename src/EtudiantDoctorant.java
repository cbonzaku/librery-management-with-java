public class EtudiantDoctorant extends EtudiantGrade
{
    String theme;
    int annee;
    String nomDurecteur;

    public EtudiantDoctorant(int n_identification, String nom, String prenom, String adress, int n_inscreption, String specialite, String theme, int annee, String nomDurecteur) {
        super(n_identification, nom, prenom, adress, n_inscreption, specialite);
        this.theme = theme;
        this.annee = annee;
        this.nomDurecteur = nomDurecteur;
    }
}
