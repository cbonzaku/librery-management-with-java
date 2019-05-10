public class Proceding extends Document
{
    String titre;
    String lieu;
    String periode;

    public Proceding(int n_isbn, int n_inventaire, String titre, String lieu, String periode) {
        super(n_isbn, n_inventaire);
        this.titre = titre;
        this.lieu = lieu;
        this.periode = periode;
    }
}
