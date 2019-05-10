import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormate.parse("18-12-2018");
        Date date1 = dateFormate.parse("09-01-2018");
        Date date2 = dateFormate.parse("22-10-2006");
        Date date4 = dateFormate.parse("01-06-2012");
        Date date5 = dateFormate.parse("04-10-2009");
        Date date6 = dateFormate.parse("01-01-2018");
        Date date7 = dateFormate.parse("05-02-2018");
        Date date8 = dateFormate.parse("01-10-2017");


        ArrayList<Abonne> listNoir = new ArrayList<>();
        ArrayList<Attente> listAtt = new ArrayList<>();
        ArrayList<Emprunt> DocEmpunt = new ArrayList<>();
        ArrayList<Enseignent> enseignents = new ArrayList<>();
        ArrayList<Document> listDocNonRetourne = new ArrayList<>();


        ArrayList<Auteur> auteurs = new ArrayList<Auteur>();
        Auteur auteur1 = new Auteur("ali", "didi");
        auteurs.add(auteur1);

        ArrayList<Document> documents = new ArrayList<>();
        ArrayList<Abonne> abonnes = new ArrayList<>();

        Emprunt emprunt = new Emprunt(3, 4, date2);
        Emprunt emprunt1 = new Emprunt(4, 5, date6);
        Emprunt emprunt2 = new Emprunt(1, 1, date7);
        Emprunt emprunt3 = new Emprunt(9,6,date8);

        DocEmpunt.add(emprunt);
        DocEmpunt.add(emprunt1);
        DocEmpunt.add(emprunt2);

        Livre e = new Livre(documents.size(), documents.size(), "system exploitation", "parssone", date, "info", auteurs);
        documents.add(e);
        Livre e1 = new Livre(documents.size(), documents.size(), "graphic", "aaaaa", date, "info", auteurs);
        documents.add(e1);
        Livre e2 = new Livre(documents.size(), documents.size(), "ANALYSE", "M", date, "math", auteurs);
        documents.add(e2);
        Proceding p = new Proceding(documents.size(), documents.size(), "la bib", "amphi1", "2018-2019");
        documents.add(p);
        Proceding p2 = new Proceding(documents.size(), documents.size(), "redaction", "amphi1", "2018-2019");
        documents.add(p2);
        Proceding p3 = new Proceding(documents.size(), documents.size(), "time", "amphi1", "2018-2019");
        documents.add(p3);
        Revue r = new Revue(documents.size(), documents.size(), "revue1", "2018-2019", "math");
        documents.add(r);
        Revue r1 = new Revue(documents.size(), documents.size(), "revue2", "2018-2019", "chimi");
        documents.add(r1);
        Proceding proceding1 = new Proceding(documents.size(), documents.size(), "math", "tmouchent", "32");
        Revue revue1 = new Revue(documents.size(), documents.size(), "lunix", "22", "info");
        documents.add(revue1);


        Enseignent enseignent = new Enseignent(abonnes.size(), "mouhamed", "ali", "oran", 9876, "info", "MAA", date6);
        abonnes.add(enseignent);
        Enseignent enseignent1 = new Enseignent(abonnes.size(), "walid", "nassime", "oran", 7876, "info", "MAB", date1);
        abonnes.add(enseignent1);
        Enseignent enseignent2 = new Enseignent(abonnes.size(), "Achraf", "abd rahman", "oran", 8876, "info", "MCA", date2);
        abonnes.add(enseignent2);
        Enseignent enseignent3 = new Enseignent(abonnes.size(), "islam", "oussama", "oran", 8876, "info", "MCB", date8);
        abonnes.add(enseignent3);
        Employer employer = new Employer(abonnes.size(), "sidou", "himour", "oran", 4444, date, "em");
        abonnes.add(employer);
        Employer employer1 = new Employer(abonnes.size(), "hamid", "jawad", "oran", 5555, date5, "em");
        abonnes.add(employer1);
        Employer employer2 = new Employer(abonnes.size(), "khaled", "karim", "oran", 6666, date6, "em");
        abonnes.add(employer2);
        EtudiantGrade etudiantGrade = new EtudiantGrade(abonnes.size(), "faycal", "faycal", "oran", abonnes.size(), "sm");
        abonnes.add(etudiantGrade);
        EtudiantGrade etudiantGrade2 = new EtudiantGrade(abonnes.size(), "bekkay", "Abdlhamide", "oran", abonnes.size(), "sm");
        abonnes.add(etudiantGrade2);
        EtudiantDoctorant etudiantDoctorant = new EtudiantDoctorant(abonnes.size(), "amina", "aamina", "oran", 89, "st", "theme1", 2009, enseignent.nom);
        abonnes.add(etudiantDoctorant);
        EtudiantDoctorant etudiantDoctorant2 = new EtudiantDoctorant(abonnes.size(), "anis", "anis", "oran", 12487654, "mi", "theme2", 2020, enseignent1.nom);
        abonnes.add(etudiantDoctorant2);
        EtudiantDoctorant etudiantDoctorant3 = new EtudiantDoctorant(abonnes.size(), "ayman", "bahri", "oran", 1248764, "mi", "theme2", 2020, enseignent.nom);
        abonnes.add(etudiantDoctorant3);


        enseignents.add(enseignent);
        enseignents.add(enseignent1);
        enseignents.add(enseignent2);

        int n;


        boolean t = true;
        Bibliothecaire b = new Bibliothecaire();


        while (t) {

            System.out.println("+++++++++++Bienvenue++++++++");
            System.out.println("Veuillez choisir:\n1)Recherche un document\n2)Recherche un abonne\n" +
                    "3)Afficher la liste des enseignent selon le grade\n" +
                    "4)Afficher la list des etudiant selon la specialite\n" +
                    "5)Afficher la list des doctorant dirige par un enseignent\n" +
                    "6)affichage croissant des enseignent selon la date de recrutement\n" +
                    "7)affichage des enseignent decroissant selon le nombre de these dirige\n" +
                    "8)ajouter un document\n" +
                    "9)afficher les document empunte\n" +
                    "10)affiche la liste noire des abonnees\n" +
                    "11)affichage decroissant de la list noire selon la pinalite\n" +
                    "12)Retourne un document\n" +
                    "13)Ajouter un abonne\n" +
                    "14)afficher la list des documents non retourne\n ");
            n = s.nextInt();
            switch (n) {
                case 1:
                    b.rechercheDocument(documents);
                    break;
                case 2:
                    b.recherchAbonee(abonnes);
                    break;
                case 3:
                    b.affichageEnseignent(enseignents);
                    break;
                case 4:
                    b.affichageEtudiants(abonnes);
                    break;
                case 5:
                    b.affichageDoctorant(abonnes);
                    break;
                case 6:
                    b.affichageCroissant(abonnes);
                    break;
                case 7:
                    b.affichageDecroissant(abonnes);
                    break;
                case 9:
                    b.afficheDocEmprunte(DocEmpunt);
                    break;
                case 10:
                    b.afficheListNoir(DocEmpunt, abonnes, listNoir);
                    break;
                case 11:
                    b.afficheDecroissantNoir(DocEmpunt, abonnes, listNoir);
                    break;
                case 12:
                    b.retourneDoc(DocEmpunt, abonnes);
                    break;
                case 13:
                    b.ajouterUnAbonne(abonnes);
                    break;
                case 14:
                    b.afficheDocNonRetourne(DocEmpunt, documents, abonnes, listDocNonRetourne);
                    break;
                case 8:
                    b.ajoutDoc(documents);

            }

        }
    }
}
