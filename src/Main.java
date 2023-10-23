public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};

        int somme = mohamedAzizAjmi.calculerSomme(tableau);
        System.out.println("La somme des éléments du tableau est : " + somme);

        double moyenne = mohamedAzizAjmi.calculerMoyenne(tableau);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);

        NouriMohamedAmine man=new NouriMohamedAmine();
        System.out.println( man.isPremier(121));
    }
}