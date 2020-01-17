import java.util.ArrayList;
import java.util.Scanner;

public class Tableaux {

    /* Affiche les nombres de la suite Fibonacci */
    public static void SuiteFibonacci() {
        int[] suite = new int[10];

        suite[0] = suite[1] = 1;

        System.out.println("0 : 1");
        System.out.println("1 : 1");

        for (int i = 2; i <= 7; i++) {
            suite[i] = suite[i - 1] + suite[i - 2];
            System.out.println(i + " : " + suite[i]);
        }
    }

    /* Fait saisir 10 nombres à l'utilisateur
    * et affiche le maximum */
    public static void MaxTableau() {
        double[] doubles = new double[10];
        double max = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < doubles.length ; i++)
        {
            System.out.println("Saisir un nombre ");
            doubles[i] = scanner.nextDouble();

            if(doubles[i] > max)
                max = doubles[i];
        }

        System.out.println("Le nombre max est : " + max);
    }

    /* Fait saisir 11 nombres à l'utilisateur et
     * indique si le 11e fait partie du tableau */
    public static void FlagTableau() {
        //double[] doubles = new double[10];
        ArrayList<Double> doubles = new ArrayList<>();
        double max= 0, nb;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i < 5 ; i++)
        {
            System.out.println("Saisir un nombre ");
            doubles.add(scanner.nextDouble());
        }

        System.out.println("Saisir le nombre à trouver : ");

        if(doubles.contains(scanner.nextDouble()))
            System.out.println("Trouvéééééééééééé ");
        else
            System.out.println("Eh non désolé! ");
    }
}

