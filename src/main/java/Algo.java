import java.text.DecimalFormat;
import java.util.Scanner;


public class Algo {

    /* Demande à l'utilisateur de saisir son
     *  nom et prénom et retourne son nom complet */
    public static String RetourneNomComplet() {
        String nom, prenom;

        Scanner scanner = new Scanner(System.in);
        nom = scanner.nextLine();
        prenom = scanner.nextLine();
        return prenom + " " + nom;
    }


    public static void Majuscule () {

        Scanner a= new Scanner(System.in);
        System.out.println("Entrer une Lettre majuscule : ");
        String c= a.nextLine();

        while (!c.equals(c.toUpperCase())) {
            System.out.println("Entrer une Lettre majuscule : ");
            c= a.nextLine();

        }
    }

    /* Prend en entrée le nombre de photocopies
     * et affiche le prix total */
    public static void CalculerPrixPhotocopies()
    {
        int nbPhotocopies;
        double prix = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre entier");
        nbPhotocopies = Integer.valueOf(scanner.nextLine());

        if(nbPhotocopies < 10) {
            prix = nbPhotocopies * 0.5;
        }
        else if (nbPhotocopies <= 20) {
            prix = nbPhotocopies * 0.4;
        }
        else{
            prix = nbPhotocopies * 0.3;
        }
        System.out.println("Prix total : " + prix);
    }

    /*
    Indique si le produit des 2 nombres
    saisis est positif ou négatif
     */
    public static void ProduitNombresPositifOuNegatif()
    {
        int nombre1,nombre2,produit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre entier");
        nombre1 = Integer.valueOf(scanner.nextLine());
        nombre2 = Integer.valueOf(scanner.nextLine());
        produit = nombre1*nombre2;

        if((nombre1 > 0 && nombre2 < 0) || (nombre1 < 0 && nombre2 > 0)){
            System.out.println("Le produit est négatif");
        }
        else {
            System.out.println("Le produit est positif");
        }

    }

    /*
    Calcule le périmètre d'un rectangle dont la longueur
    et la largeur sont saisies par l'utilisateur
     */
    public static void CalculerPerimetreRectangle()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur du rectangle");
        String longueur = scanner.nextLine();
        System.out.println("Saisir la largeur du rectangle");
        String largeur = scanner.nextLine();
        float perimetre = RetournerPerimetreRectangle(Float.valueOf(longueur),  Float.valueOf(largeur));

        // Calculer périmètre rectangle
        System.out.println("Le périmètre d'un rectangle de longueur " + longueur);
        System.out.println(" et de largeur " + largeur + " est de : " + perimetre);
    }

    public static float RetournerPerimetreRectangle(float longueur, float largeur)
    {
        return longueur*largeur;
    }

    /*
    Indique si le nombre saisi est divisible par 3
     */
    public static void NombreDivisiblePar3() {
        int nombre;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre entier");
        nombre = Integer.valueOf(scanner.nextLine());

        if(nombre%3==0) {
            System.out.println("Ce nombre est divisible par 3");
        }
        else{
            System.out.println("Ce nombre n'est pas divisible par 3");
        }

    }

    /*
     Permet de calculer le nombre de radiateurs nécessaires
     pour chauffer une pièce dont la longueur, la largeur
     et la hauteur sont saisis par l'utilisateur
    */
    public static void CalculerNbRadiateursNecessaires()
    {
        int volumeParRadiateur = 8;
        int longueur, largeur, hauteur, volume, nbRadiateurs, surfaceRestante;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir la longueur de la pièce");
        longueur = Integer.valueOf(scanner.nextLine());

        System.out.println("Saisir la largeur de la pièce");
        largeur = Integer.valueOf(scanner.nextLine());

        System.out.println("Saisir la hauteur de la pièce");
        hauteur = Integer.valueOf(scanner.nextLine());

        volume = longueur * largeur * hauteur;
        nbRadiateurs = volume / volumeParRadiateur;
        surfaceRestante = volume % volumeParRadiateur;

        if(surfaceRestante > 0){
            nbRadiateurs++;
        }

        System.out.println("Pour chauffer cette pièce il faut : " + nbRadiateurs + " radiateur(s)");
    }


    /*
    Permet d'afficher le prix de 1 à 10 baguettes
   */
    public static void Boulangerie() {
        double prixBaguette = 0.8;
        DecimalFormat df = new DecimalFormat("0.00");
        //df.setMaximumFractionDigits(2);

        for(int i = 1 ; i <= 10; i++) {
            System.out.println("Prix de " + i + " baguettes : " + df.format(i*prixBaguette) + " €");
        }
    }

    /*
    Permet de calculer la factorielle du
    nombre saisi par l'utilisateur
   */
    public static void Factorielle() {
        int n = -1, factorielle = 1, i = 2;

        try {
            // Saisir le nombre dont on veut calculer la factorielle
            Scanner scanner = new Scanner(System.in);

            // On invite à saisir un nombre positif
            while (n < 0) {
                System.out.println("Saisir un nombre entier positif ou nul");
                n = scanner.nextInt();
            }

            while (i <= n) {
                factorielle *= i;
                i++;
            }

            //System.out.println("La factorielle de " + n + " est : " + factorielle);

        } catch (Exception e) {
            System.out.println("Une exception s'est produite : " + e.getMessage());
        }

    }

    /*
    public static void Pizza()
    {
        int poidsPizza1, poidsPizza2;
        double prixPizza1, prixPizza2, prixAuKgPizza1, prixAuKgPizza2;

        // Saisir le poids de la première pizza
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le poids de la première pizza (en grammes)");
        poidsPizza1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Saisir le prix de la première pizza (en euros)");
        prixPizza1 = Double.valueOf(scanner.nextLine());
        prixAuKgPizza1 = prixPizza1 * 1000 / poidsPizza1;

        // Saisir le poids de la deuxième pizza
        System.out.println("Saisir le poids de la deuxième pizza (en grammes)");
        poidsPizza2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Saisir le prix de la deuxième pizza (en euros)");
        prixPizza2 = Double.valueOf(scanner.nextLine());
        prixAuKgPizza2 = prixPizza2 * 1000 / poidsPizza2;

        if(prixAuKgPizza1 <= prixAuKgPizza2){
            System.out.println("La première pizza a le meilleur prix au kilo : " + prixAuKgPizza1);
        }
        else {
            System.out.println("La deuxième pizza a le meilleur prix au kilo : " + prixAuKgPizza2);
        }
    }*/


   /*
   Compare le prix et la masse de 2 pizzas
   et indique laquelle est la plus avantageuse
    */
    public static void MassePizza () {
        int massePizza1 = 0, massePizza2 = 0;
        double prixPizza1 = 0, prixPizza2 = 0, rapport1 = 0, rapport2 = 0;

        try {

            Scanner scanner = new Scanner(System.in);

            while (massePizza1 <= 0) {
                // Saisir la masse de la première pizza
                System.out.println("Saisir la masse de la première pizza");
                massePizza1 = Integer.valueOf(scanner.nextLine());
            }

            // Le prix de la pizza ne doit pas être négatif ou nul
            while (prixPizza1 <= 0) {
                System.out.println("Saisir le prix de la première pizza");
                prixPizza1 = Double.valueOf(scanner.nextLine());
                rapport1 = massePizza1 / prixPizza1;
            }

            while (massePizza2 <= 0) {
                // Saisir la masse de la deuxième pizza
                System.out.println("Saisir la masse de la deuxième pizza");
                massePizza2 = Integer.valueOf(scanner.nextLine());
            }

            while (prixPizza2 <= 0) {
                System.out.println("Saisir le prix de la deuxième pizza");
                prixPizza2 = Double.valueOf(scanner.nextLine());
                rapport2 = massePizza2 / prixPizza2;
            }

            if (rapport1 < rapport2) {
                System.out.println("La première pizza a le meilleur prix au kilo");
            } else if (rapport1 == rapport2) {
                System.out.println("Les deux pizzas ont le même prix au kilo ");
            } else {
                System.out.println("La deuxième pizza a le meilleur prix au kilo ");
            }
        }
        catch (Exception e){
            System.out.println("Une exception s'est produite : " + e.getMessage());
        }
    }

    /*
    Invite à saisir des nombres entiers puis
    Détermine le plus grand nombre et son rang
     */
    public static void NbLePlusGrand() {
        int n=1, max=0, rang=1, rangMax=2;

        Scanner scanner = new Scanner(System.in);

        while(n!=0){
            System.out.println("Saisir un entier positif (0 pour arrêter)");
            n = scanner.nextInt();

            if(n>max){
                max=n;
                rangMax=rang;
            }
            rang++;
        }

        System.out.println("Le nombre le plus grand est " + max + " situé au rang "+ rangMax);
    }

    public static void Demographie() {
        double taux  = 0.0089;
        int seuil  = 100000;
        int anneeDepart = 2013;
        int nbHabitants = 87697, annee;

        annee = anneeDepart;

        while (nbHabitants < seuil){
            annee++;
            nbHabitants *= (1+taux);
        }

        System.out.println("C'est en " + annee + " qu'on atteindra " + nbHabitants + " habitants");
    }

}
