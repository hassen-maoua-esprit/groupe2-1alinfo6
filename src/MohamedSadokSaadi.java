public class MohamedSadokSaadi {

    public static void trierTableaux(int[] tab) {
        int[] tabTrier = new int[tab.length];
        for (int i = 0; i < tab.length - 1; i++) {   
            for (int j = 0; j < tab.length - i - 1; j++) {
                if(tab[j] > tab[j + 1]) {
                    int aux = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = aux;
                }
            }
        }
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}