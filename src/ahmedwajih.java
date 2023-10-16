/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesst;

/**
 *
 * @author wajihbenhmida
 */
public class Tesst {

    /**
     * @param args the command line arguments
     */
    
    //pgcd
    
    public static int pgcd(int a, int b) {
while (b != 0) {
int temp = b;
b = a % b;
}
return a;
}
    public static void main(String[] args) 
    
    {
        // TODO code application logic here
        
        //puissance
     /*   double base = 2 ;
        double exp = 3 ;
        double res = Math.pow(base,exp);
        System.out.println("2*3 =" +res  );*/
        
        //pgcd
        
        int nombrel = 48;
int nombre2 = 18;
int pgcdResultat = pgcd (nombrel, nombre2);
System.out.println("Le PGCD de" + nombrel + " et" + nombre2 + " est : " + pgcdResultat);
        
        
        
    }
    
}
