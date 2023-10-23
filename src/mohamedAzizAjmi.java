public class mohamedAzizAjmi {
    public static int calculerSomme(int[] tableau) {
        int s = 0;

        int k=10;
        int x=12;
        for (int i = 0; i < tableau.length; i++) {
            s += tableau[i];
        }

<<<<<<< HEAD
        return somme*k+x;
=======
        return s;
>>>>>>> origin/Mohamed_Aziz_Ajmi
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
