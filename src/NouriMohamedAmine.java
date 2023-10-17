public class NouriMohamedAmine {
    public boolean isPremier(int n){
        for (int i=2;i<n-1;i++){
            if ((n % i)==0){
                return false;
            }
        }
        return true;

    }

    public String InverserChaine(String ch){
        for (int i=ch.length();i>1;i++){
            ch=ch+ch.charAt(i);
        }
        return ch;

    }
}
