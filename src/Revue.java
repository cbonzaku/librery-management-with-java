public class Revue extends Document
{
    String nom;
    String periode_edi;
    String specialite;

    public Revue(int n_isbn, int n_inventaire, String nom, String periode_edi, String specialite) {
        super(n_isbn, n_inventaire);
        this.nom = nom;
        this.periode_edi = periode_edi;
        this.specialite = specialite;
    }
}
