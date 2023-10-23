public class mohamedAzizAjmi {
    public static int calculerSomme(int[] tableau) {
        int s = 0;

        for (int i = 0; i < tableau.length; i++) {
            s += tableau[i];
        }

        return s;
    }


    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0.0;
        }

        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        return (double) somme / tableau.length;
    }


}
