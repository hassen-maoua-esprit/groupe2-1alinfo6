public class HassenMaoua {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static boolean estPair(int x) {
        return  (x % 2 == 0);
    }
}
