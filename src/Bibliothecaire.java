import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class Bibliothecaire {

    Scanner s = new Scanner(System.in);
    String recherch;
    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");


    public Document rechercheDocument(ArrayList<Document> documents) {
        int n;
        Document d = null;
        System.out.println("veuillez choisir le mode de recherche :\n 1)par N_d'inventaire \n2)par N_isbn\n3)par titre");
        n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("entrer le N_d'inventaire:\n");
                recherch = s.next();
                for (int i = 0; i < documents.size(); i++) {
                    if (Integer.parseInt(recherch) == documents.get(i).N_inventaire) {
                        if (documents.get(i) instanceof Livre) {
                            System.out.println("livre:" + ((Livre) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                        if (documents.get(i) instanceof Proceding) {
                            System.out.println("proceding:" + ((Proceding) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                        if (documents.get(i) instanceof Revue) {
                            System.out.println("revue:" + ((Revue) documents.get(i)).nom);
                            d = documents.get(i);
                        }
                    }
                }
                break;
            case 2:
                System.out.println("entrer le N_isbn:\n");
                recherch = s.next();
                for (int i = 0; i < documents.size(); i++) {
                    if (Integer.parseInt(recherch) == documents.get(i).N_isbn) {
                        if (documents.get(i) instanceof Livre) {
                            System.out.println("livre:" + ((Livre) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                        if (documents.get(i) instanceof Proceding) {
                            System.out.println("proceding:" + ((Proceding) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                        if (documents.get(i) instanceof Revue) {
                            System.out.println("revue:" + ((Revue) documents.get(i)).nom);
                            d = documents.get(i);
                        }
                    }
                }
                break;
            case 3:
                System.out.println("entrer le titre:\n");
                recherch = s.next();
                for (int i = 0; i < documents.size(); i++) {
                    if (documents.get(i) instanceof Proceding) {
                        if (recherch.equals(((Proceding) documents.get(i)).titre)) {
                            System.out.println("proceding trouver" + ((Proceding) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                    }
                    if (documents.get(i) instanceof Livre) {
                        if (recherch.equals(((Livre) documents.get(i)).titre)) {
                            System.out.println("Livre trouver" + ((Livre) documents.get(i)).titre);
                            d = documents.get(i);
                        }
                    }
                    if (documents.get(i) instanceof Revue) {
                        if (recherch.equals(((Revue) documents.get(i)).nom)) {
                            System.out.println("Revue trouver" + ((Revue) documents.get(i)).nom);
                            d = documents.get(i);
                        }
                    }
                }
        }
        return d;

    }

    public Abonne recherchAbonee(ArrayList<Abonne> abonnes) {
        int n;
        Abonne abonne = null;
        System.out.println("veuillez choisir le mode de recherche :\n 1)N° d'identification\n 2)nom\n");
        n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("veuillez entrer le N° d'identification :\n");
                recherch = s.next();
                for (int i = 0; i < abonnes.size(); i++) {
                    if (Integer.parseInt(recherch) == abonnes.get(i).N_identification) {
                        if (abonnes.get(i) instanceof EtudiantGrade) {
                            EtudiantGrade etudiantGrade = (EtudiantGrade) abonnes.get(i);
                            System.out.println("Etudiant trouver :\n" + etudiantGrade.nom);
                            abonne = abonnes.get(i);
                        }
                        if (abonnes.get(i) instanceof Enseignent) {
                            System.out.println("Enseignent trouver :\n" + abonnes.get(i).nom);
                            abonne = abonnes.get(i);
                        }
                        if (abonnes.get(i) instanceof Employer) {
                            System.out.println("employer trouver :\n" + abonnes.get(i).nom);
                            abonne = abonnes.get(i);
                        }
                    }
                }
                break;
            case 2:
                System.out.println("veuillez entrer le nom :\n");
                recherch = s.next();
                for (int i = 0; i < abonnes.size(); i++) {
                    if (recherch.equals(abonnes.get(i).N_identification)) {
                        if (abonnes.get(i) instanceof EtudiantGrade) {
                            EtudiantGrade etudiantGrade = (EtudiantGrade) abonnes.get(i);
                            System.out.println("Etudiant trouver :\n" + etudiantGrade.nom);
                            abonne = abonnes.get(i);
                        }
                        if (abonnes.get(i) instanceof Enseignent) {
                            System.out.println("Enseignent trouver :\n" + abonnes.get(i).nom);
                            abonne = abonnes.get(i);
                        }
                        if (abonnes.get(i) instanceof Employer) {
                            System.out.println("employer trouver :\n" + abonnes.get(i).nom);
                            abonne = abonnes.get(i);
                        }
                    } else {
                        System.out.println("abonne non trouver");
                    }
                }
                break;
            default:
                System.out.println("veuillez choisir entre 1&2");

        }
        return abonne;

    }

    public void affichageEnseignent(ArrayList<Enseignent> enseignents) {
        int n;
        System.out.println("veuillez choisir :\n 1)afficher  tout les enseignents\n 2)afficher les enseignents d'une grade\n ");
        n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("enseignents de grade MAA:\n");
                for (int i = 0; i < enseignents.size(); i++) {
                    if (enseignents.get(i).grade.equals("MAA") || enseignents.get(i).grade.equals("A")) {
                        System.out.println("nom d'enseignant : " + enseignents.get(i).nom + "\n");

                    }
                }
                System.out.println("enseignents de grade MAB:\n");
                for (int i = 0; i < enseignents.size(); i++) {
                    if (enseignents.get(i).grade.equals("MAB") || enseignents.get(i).grade.equals("b")) {
                        System.out.println("nom d'enseignant : " + enseignents.get(i).nom + "\n");

                    }
                }
                System.out.println("enseignents de grade MCA:\n");
                for (int i = 0; i < enseignents.size(); i++) {
                    if (enseignents.get(i).grade.equals("MCA") || enseignents.get(i).grade.equals("b")) {
                        System.out.println("nom d'enseignant : " + enseignents.get(i).nom + "\n");

                    }
                }
                System.out.println("enseignents de grade MCB:\n");
                for (int i = 0; i < enseignents.size(); i++) {
                    if (enseignents.get(i).grade.equals("MCB") || enseignents.get(i).grade.equals("b")) {
                        System.out.println("nom d'enseignant : " + enseignents.get(i).nom + "\n");

                    }
                }
                break;
            case 2:
                System.out.println("veuillez choisir le grade :\n 1)grade MAA\n 2)grade MAB\n3)grade MCA\n4)grade MCB\n");
                n = s.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("enseignents de grade MAA:\n");
                        for (int i = 0; i < enseignents.size(); i++) {
                            if (enseignents.get(i).grade.equals("MAA")) {
                                System.out.println("nom d'enseignant: " + enseignents.get(i).nom + "\n");

                            }
                        }
                        break;
                    case 2:

                        System.out.println("enseignents de grade MAB:\n");
                        for (int i = 0; i < enseignents.size(); i++) {
                            if (enseignents.get(i).grade.equals("MAB")) {
                                System.out.println("nom d'enseignant: " + enseignents.get(i).nom + "\n");

                            }
                        }
                        break;
                    case 3:

                        System.out.println("enseignents de grade MCA:\n");
                        for (int i = 0; i < enseignents.size(); i++) {
                            if (enseignents.get(i).grade.equals("MCA")) {
                                System.out.println("nom d'enseignant: " + enseignents.get(i).nom + "\n");

                            }
                        }
                        break;
                    case 4:
                        System.out.println("enseignents de grade MCB:\n");
                        for (int i = 0; i < enseignents.size(); i++) {
                            if (enseignents.get(i).grade.equals("MCB")) {
                                System.out.println("nom d'enseignant: " + enseignents.get(i).nom + "\n");

                            }
                        }
                        break;
                    default:
                        System.out.println("veuillez choisir entre 1 et 2");


                }
                break;
            default:
                System.out.println("veuillez choisir entre 1 et 2");
        }

    }

    public void affichageEtudiants(ArrayList<Abonne> abonnes) {
        int n = 0;
        System.out.println("veuillez entre la spicialite :\n");
        recherch = s.next();
        System.out.println("les etudiant de la specialite " + recherch + ":\n");
        for (int i = 0; i < abonnes.size(); i++) {
            if (abonnes.get(i) instanceof EtudiantGrade) {
                if (recherch.equals(((EtudiantGrade) abonnes.get(i)).specialite)) {
                    System.out.println("nom d'etudiant:" + abonnes.get(i).nom + " prenom d'etudiant:" + abonnes.get(i).prenom);
                    n++;
                }

            }
        }
        if (n == 0) {
            System.out.println("pas etudiant de cette specialite");
        }
    }

    public void affichageDoctorant(ArrayList<Abonne> abonnes) {
        int n = 0;
        int m;



        System.out.println("veuillez entrer le nom d'enseignent :\n");
        recherch = s.next();
        System.out.println("les etudiants encadre par " + recherch + ":\n");
        for (int i = 0; i < abonnes.size(); i++) {
            if (abonnes.get(i) instanceof EtudiantDoctorant) {
                if (recherch.equals(((EtudiantDoctorant) abonnes.get(i)).nomDurecteur)) {
                    System.out.println("nom d'etudiant: " + abonnes.get(i).nom + " prenom d'etudiant" + abonnes.get(i).prenom);
                    n++;
                }
            }
        }


        if(n ==0)
    {
        System.out.println("pas de etudiant");
    }

}

    public void affichageCroissant(ArrayList<Abonne> abonnes) {
        ArrayList<Enseignent> enseignents = new ArrayList<Enseignent>();
        int i;
        for (i = 0; i < abonnes.size(); i++) {
            if (abonnes.get(i) instanceof Enseignent) {
                enseignents.add((Enseignent) abonnes.get(i));
            }
        }

        Collections.sort(enseignents, new Comparator<Enseignent>() {
            public int compare(Enseignent e, Enseignent s) {
                return e.dateRecrutement.compareTo(s.dateRecrutement);
            }
        });
        for (i = 0; i < enseignents.size(); i++) {
            System.out.println("nom:" + enseignents.get(i).nom + " prenom:" + enseignents.get(i).prenom + " date de recrutement:" + enseignents.get(i).dateRecrutement);
        }

    }

    public void affichageDecroissant(ArrayList<Abonne> abonnes) {
        ArrayList<EtudiantDoctorant> etudiantDoctorants = new ArrayList<EtudiantDoctorant>();
        ArrayList<Enseignent> enseignents = new ArrayList<>();
        for (int i = 0; i < abonnes.size(); i++) {
            if (abonnes.get(i) instanceof EtudiantDoctorant) {
                etudiantDoctorants.add((EtudiantDoctorant) abonnes.get(i));
            }
        }
        for (int i = 0; i < abonnes.size(); i++) {
            if (abonnes.get(i) instanceof Enseignent) {
                int k = 0;
                for (int j = 0; j < etudiantDoctorants.size(); j++) {
                    if (abonnes.get(i).nom.equals(etudiantDoctorants.get(j).nomDurecteur)) {

                        enseignents.add((Enseignent) abonnes.get(i));
                        k++;
                        ((Enseignent) abonnes.get(i)).nbr_these = k;


                    }
                }

            }
        }
        ArrayList<Enseignent>e=new ArrayList<>();
         e.add(enseignents.get(0));
        for (int i=0;i<enseignents.size();i++){

            for (int j=0;j<e.size();j++){
                if(!(enseignents.get(i).nom.equals(e.get(j).nom))){
                    e.add(enseignents.get(i));
                }
            }
        }


        Collections.sort(e, new Comparator<Enseignent>() {
            @Override
            public int compare(Enseignent o1, Enseignent o2) {
                return Integer.valueOf(o2.nbr_these).compareTo(o1.nbr_these);
            }
        });
        for (int i = 0; i < e.size(); i++) {
            System.out.println("enseignent:" + e.get(i).nom + "-" + e.get(i).prenom + "--nombre de these dirige:" +
                    "" + e.get(i).nbr_these);

        }
    }


    public void afficheDocEmprunte(ArrayList<Emprunt> listDocEmprunter) {
        System.out.println("veuiller entre le N_identification:\n");
        int n = s.nextInt();
        System.out.println("les documents emprunte:\n");
        for (int i = 0; i < listDocEmprunter.size(); i++) {
            if (listDocEmprunter.get(i).N_identification == n) {
                System.out.println("N_iventaire ddu document : " + listDocEmprunter.get(i).N_inventaire + " N_identification d'dabonnes:" + listDocEmprunter.get(i).N_identification + " date d'emprunt: " + listDocEmprunter.get(i).date_emprunt + "\n");
            }
        }
    }

    public void afficheDocNonRetourne(ArrayList<Emprunt> listDocEmprunter, ArrayList<Document> documents, ArrayList<Abonne> abonnes, ArrayList<Document> listDocNonRetourne) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        listDocNonRetourne.clear();
        for (int i = 0; i < listDocEmprunter.size(); i++) {

            long l = Math.abs(listDocEmprunter.get(i).date_emprunt.getTime() - d.getTime());
            long l1 = TimeUnit.DAYS.convert(l, TimeUnit.MILLISECONDS);
            for (int j = 0; j < abonnes.size(); j++) {
                if (listDocEmprunter.get(i).N_identification == abonnes.get(j).N_identification) {
                    if (abonnes.get(j) instanceof EtudiantGrade) {
                        if (l1 > 21) {
                            for (int k = 0; k < documents.size(); k++) {
                                if (documents.get(k).N_inventaire == listDocEmprunter.get(i).N_inventaire) {
                                    listDocNonRetourne.add(documents.get(k));
                                }

                            }
                        }
                    }
                    if (abonnes.get(j) instanceof Enseignent) {
                        if (l1 > 30) {
                            for (int k = 0; k < documents.size(); k++) {
                                if (documents.get(k).N_inventaire == listDocEmprunter.get(i).N_inventaire) {
                                    listDocNonRetourne.add(documents.get(k));
                                }

                            }
                        }
                    }
                    if (abonnes.get(j) instanceof Employer) {
                        if (l1 > 14) {
                            for (int k = 0; k < documents.size(); k++) {
                                if (documents.get(k).N_inventaire == listDocEmprunter.get(i).N_inventaire) {
                                    listDocNonRetourne.add(documents.get(k));
                                }

                            }
                        }
                    }
                }
            }


        }
        System.out.println("les documents non retourne:\n");
        for (int i = 0; i < listDocNonRetourne.size(); i++) {
            if (listDocNonRetourne.get(i) instanceof Livre) {
                System.out.println("Livre: N_inventaire: " + listDocNonRetourne.get(i).N_inventaire + "--titre: " + ((Livre) listDocNonRetourne.get(i)).titre);

            }
            if (listDocNonRetourne.get(i) instanceof Proceding) {
                System.out.println("Proceding: N_inventaire: " + listDocNonRetourne.get(i).N_inventaire + "--titre: " + ((Proceding) listDocNonRetourne.get(i)).titre);

            }
            if (listDocNonRetourne.get(i) instanceof Revue) {
                System.out.println("Revue: N_inventaire: " + listDocNonRetourne.get(i).N_inventaire + "--titre: " + ((Revue) listDocNonRetourne.get(i)).nom);

            }
        }
    }

    public ArrayList afficheListNoir(ArrayList<Emprunt> listDocEmprunter, ArrayList<Abonne> abonnes, ArrayList<Abonne> listNoire) throws ParseException {
        listNoire.clear();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d = new Date();
        for (int i = 0; i < listDocEmprunter.size(); i++) {
            if (listDocEmprunter.size() != 0) {
                Date date = listDocEmprunter.get(i).date_emprunt;

                long m = Math.abs(d.getTime() - date.getTime());
                long l1 = TimeUnit.DAYS.convert(m, TimeUnit.MILLISECONDS);
                for (int j = 0; j < abonnes.size(); j++) {
                    if (listDocEmprunter.get(i).N_identification == abonnes.get(j).N_identification) {
                        if (abonnes.get(j) instanceof EtudiantGrade) {
                            if (l1 > 21) {
                                listNoire.add(abonnes.get(j));
                                listDocEmprunter.get(i).pinalite = (l1 - 21) * 300;
                            }
                        }
                        if (abonnes.get(j) instanceof Enseignent) {
                            if (l1 > 30) {
                                listNoire.add(abonnes.get(j));
                                listDocEmprunter.get(i).pinalite = (l1 - 21) * 700;
                            }

                        }

                    }
                    if (abonnes.get(j) instanceof Employer) {
                        if (l1 > 14) {
                            listNoire.add(abonnes.get(j));
                            listDocEmprunter.get(i).pinalite = (l1 - 21) * 500;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < listDocEmprunter.size(); i++) {
            if (listDocEmprunter.get(i).pinalite == 0) {
                for (int j = 0; j < listNoire.size(); j++) {
                    if (listDocEmprunter.get(i).N_identification == listNoire.get(j).N_identification) {
                        listNoire.remove(listNoire.get(j));
                    }
                }
            }

        }

        System.out.println("la list noire des abonne:\n");
        for (int i = 0; i < listNoire.size(); i++) {
            for (int j = 0; j < listDocEmprunter.size(); j++) {
                if (listDocEmprunter.get(j).N_identification == listNoire.get(i).N_identification)
                    System.out.println("nom:" + listNoire.get(i).nom + "  N_identification: " + listNoire.get(i).N_identification + "" +
                            " penalite:" + listDocEmprunter.get(j).pinalite + "\n");
            }
        }

        return listNoire;
    }

    public void afficheDecroissantNoir(ArrayList<Emprunt> listDocEmprunter, ArrayList<Abonne> abonnes, ArrayList<Abonne> listNoire) throws ParseException {
        ArrayList<Abonne> listN;
        ArrayList<Pinalite> pinalites = new ArrayList<>();


        listN = afficheListNoir(listDocEmprunter, abonnes, listNoire);
        for (int i = 0; i < listN.size(); i++) {
            for (int j = 0; j < listDocEmprunter.size(); j++) {
                if (listN.get(i).N_identification == listDocEmprunter.get(j).N_identification) {
                    Pinalite p = new Pinalite(listN.get(i).N_identification, listN.get(i).nom, listDocEmprunter.get(j).pinalite);
                    pinalites.add(p);
                }
            }
        }
        Collections.sort(pinalites, new Comparator<Pinalite>() {
            @Override
            public int compare(Pinalite o1, Pinalite o2) {
                return Long.valueOf(o2.pinalite).compareTo(Long.valueOf(o1.pinalite));
            }
        });
        for (int i = 0; i < pinalites.size(); i++) {
            System.out.println(" nom: " + pinalites.get(i).nom + "  penalite: " + pinalites.get(i).pinalite + "DZ");
        }
    }

    public void retourneDoc(ArrayList<Emprunt> listDocEmprunter, ArrayList<Abonne> listNoir) {
        System.out.println("le N_identification d'abonne:\n");
        int n;
        n = s.nextInt();
        for (int i = 0; i < listDocEmprunter.size(); i++) {
            if (n == listDocEmprunter.get(i).N_inventaire) {
                for (int j = 0; j < listNoir.size(); j++) {
                    if (listDocEmprunter.get(i).N_identification != listNoir.get(j).N_identification) {
                        listDocEmprunter.remove(i);

                    } else {
                        System.out.println("vous etes dans la liste noire\n");
                    }
                }
            }
        }
        System.out.println("Terminer\n");

    }

    public void ajouterUnAbonne(ArrayList<Abonne> abonnes) throws ParseException {
        String nom, prenom, adress, specialite, date, grade, departement;

        int N_ident, N_ins;
        System.out.println("veuillez choisir le type d'abonne:\n1)Etudiant\n2)Employe\n3)Enseignent\n");
        int n = 0;
        n = s.nextInt();
        switch (n) {
            case 1:

                System.out.println("entre le nom\n");
                nom = s.next();
                System.out.println("entre le prenom\n");
                prenom = s.next();
                System.out.println("entre l'adresse \n");
                adress = s.next();
                System.out.println("entre la specialite \n");
                specialite = s.next();
                N_ident = abonnes.get(abonnes.size()).N_identification + 1;
                N_ins = abonnes.size() + 1;
                Abonne abonne = new EtudiantGrade(N_ident, nom, prenom, adress, N_ins, specialite);
                System.out.println("Termine..\n");
                break;
            case 2:
                System.out.println("entre le nom\n");
                nom = s.next();
                System.out.println("entre le prenom\n");
                prenom = s.next();
                System.out.println("entre l'adresse \n");
                adress = s.next();
                System.out.println("entre la fonction \n");
                specialite = s.next();
                System.out.println("entre la date de recrutement\n");
                date = s.next();
                Date date1 = df.parse(date);
                N_ident = abonnes.get(abonnes.size()).N_identification + 1;
                N_ins = abonnes.size() + 1;
                Abonne abonne1 = new Employer(N_ident, nom, prenom, adress, N_ins, date1, specialite);
                System.out.println("Termine..\n");
                break;
            case 3:
                System.out.println("entre le nom\n");
                nom = s.next();
                System.out.println("entre le prenom\n");
                prenom = s.next();
                System.out.println("entre l'adresse \n");
                adress = s.next();
                System.out.println("entre la fonction \n");
                specialite = s.next();
                System.out.println("entre la date de recrutement\n");
                date = s.next();
                Date date2 = df.parse(date);
                System.out.println("entre le grade: A ou B\n");
                grade = s.next();
                System.out.println("entre le departement\n");
                departement = s.next();
                N_ident = abonnes.get(abonnes.size()).N_identification + 1;
                N_ins = abonnes.size() + 1;
                Abonne abonne2 = new Enseignent(N_ident, nom, prenom, adress, N_ins, departement, grade, date2);
                System.out.println("Termine..\n");
                break;
            default:
                System.out.println("choisisez entre 1 et 3");

        }
    }

    public void ajoutDoc(ArrayList<Document> documents) throws ParseException {
        System.out.println("Quel type de document  :\n" +
                "1)livre\n" +
                "2)proceding\n" +
                "3)revue\n");
        int n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println("entre le titre  :\n");
                String titre = s.next();
                System.out.println("entre le editeur  :\n");
                String editeur = s.next();
                System.out.println("entre la specialite  :\n");
                String specialite = s.next();
                System.out.println("entre la date d'edition  :\n");
                String date = s.next();
                Date date1 = df.parse(date);
                System.out.println("veuillez choisir le nombre d'auteure  :\n");
                int nbrAu = s.nextInt();
                ArrayList<Auteur> auteurs = new ArrayList<>();
                String nom;
                String prenom;
                for (int i = 0; i < n; i++) {
                    System.out.println("entre le nom du auteur " + i + " :\n");
                    nom = s.next();
                    System.out.println("entre le nom du auteur " + i + " :\n");
                    prenom = s.next();
                    Auteur a = new Auteur(nom, prenom);
                    auteurs.add(a);
                }
                Livre livre = new Livre(documents.size() + 1, documents.size() + 1, titre, editeur, date1, specialite, auteurs);
                documents.add(livre);
                System.out.println("document ajoute");
                break;
            case 2:
                System.out.println("entre le titre:\n");
                titre = s.next();
                System.out.println("entre le lieu:\n");
                String lieu = s.next();
                System.out.println("entre la periode:\n");
                String periode = s.next();
                Proceding proceding = new Proceding(documents.size() + 1, documents.size() + 1, titre, lieu, periode);
                documents.add(proceding);
                System.out.println("document ajoute");
                break;
            case 3:
                System.out.println("entre le nom du revue:\n");
                nom = s.next();
                System.out.println("entre la periode d'edition:\n");
                periode = s.next();
                System.out.println("entre la specialite :\n");
                specialite = s.next();
                Revue revue = new Revue(documents.size() + 1, documents.size() + 1, nom, periode, specialite);
                documents.add(revue);
                System.out.println("document ajoute");
                break;
            default:
                System.out.println("choisisez entre 1 et 3\n");
        }
    }


}



