import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Fonctions {

    //public Fonctions(){}

    /* Demande à l'utilisateur de saisir son
    *  nom et prénom et retourne son nom complet */
    public static String RetourneNomComplet() {
        String nom, prenom;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir nom : ");
        nom = scanner.nextLine();
        System.out.println("Saisir prénom : ");
        prenom = scanner.nextLine();
        return prenom + " " + nom;
    }

    public static int Echauffement(int nombres[]){
        int somme=0;

        for(int i=0 ; i<nombres.length ; i++){
            somme += nombres[i];
        }

        return somme;
    }

    /* Permet d'échanger les valeurs de 2 nombres */
    public static void EchangerValeurs(int nb1, int nb2){
        Nombres nombres = new Nombres(nb1, nb2);

        nombres.AfficherNombres();
        nombres.EchangerNombres();
        nombres.AfficherNombres();
    }

    /*
    Calcule la somme des premiers carrés
    jusqu'au nombre passé en paramètre
    */
    public static double SommeCarre(int nb) {
        double nombreAuCarre;

        if(nb == 0)
            return 0;
        else {
            nombreAuCarre = Math.pow(nb,2);
            System.out.println(nb + " au carré : " + nombreAuCarre);
            return nombreAuCarre + SommeCarre(nb - 1);
        }
    }

    /* Détermine le nombre de pots nécessaires
    * pour cirer une pièce dont la longueur
    * et la largeur sont saisis par l'utilisateur
    * */
    public static void CirantPourTomettes(){
        int surfaceParPot = 10, nbPots, nbPotsRestants; // m²
        double longueur, largeur, surface;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir longueur : ");
        longueur = Double.valueOf(scanner.nextLine());
        System.out.println("Saisir largeur : ");
        largeur = Double.valueOf(scanner.nextLine());

        // Calcul du nombre de pots nécessaires
        surface = longueur * largeur;
        nbPotsRestants = (int)(surface % surfaceParPot);
        nbPots = (int)(surface / surfaceParPot);

        if(nbPotsRestants > 0)
            nbPots++;

        System.out.println("Pour une surface de " + surface + " m² il faudra " + nbPots + " pots");
    }

    public static void UnPeuDeTemps(){
        int nbHeures, nbMinutes, nbSecondes, tempsTotalEnSecondes;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisir les heures : ");
            nbHeures = Integer.valueOf(scanner.nextLine());
            System.out.println("Saisir les minutes : ");
            nbMinutes = Integer.valueOf(scanner.nextLine());
            System.out.println("Saisir les secondes : ");
            nbSecondes = Integer.valueOf(scanner.nextLine());

            tempsTotalEnSecondes = nbHeures * 3600 + nbMinutes * 60 + nbSecondes;

            System.out.println("Cela correspond à " + tempsTotalEnSecondes + " secondes");
        }
        catch(Exception ex){
            System.out.println("Une exception s'est produite : " + ex.getMessage());
        }
    }

    /*
    Demande à l'utilisateur son nom et sa date d'anniversaire
    et lui souhaite joyeux anniversaire si c'est aujourd'hui
     */
    public static void Anniversaire(){
        String nom, datePattern = "dd/MM/yyyy";
        Date date, dateAjd;
        Calendar calendarAnniversaire;

        try {
            SimpleDateFormat sdf=new SimpleDateFormat(datePattern);
            dateAjd = java.sql.Date.valueOf(LocalDate.now());
            Calendar calendarAjd = Calendar.getInstance();
            calendarAjd.setTime(dateAjd);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisir votre nom : ");
            nom = scanner.nextLine();

            System.out.println("Saisir votre date d'anniversaire : ");

            date = sdf.parse(scanner.nextLine());
            calendarAnniversaire = Calendar.getInstance();
            calendarAnniversaire.setTime(date);

            //if(date..compareTo(dateAjd)== 0){
            if(calendarAnniversaire.get((Calendar.MONTH)) == calendarAjd.get((Calendar.MONTH))
            && calendarAnniversaire.get((Calendar.DAY_OF_MONTH)) == calendarAjd.get((Calendar.DAY_OF_MONTH))){
                System.out.println("Joyeux anniversaire " +  nom);
            }
            else {
                System.out.println("Erreur de personne ! ");
            }

        }
        catch (Exception ex)
        {}
    }

    /*
    Calcule le n-ième terme de la suite de Fibonnacci
    * */
    public static int Fibonacci(int n){
        int res;
        if(n == 0 || n == 1)
            res = 1;
        else
            res = Fibonacci(n-1) + Fibonacci(n-2);
        return  res;
    }
}
