import java.util.Scanner;
public class BinarioDecimale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s = "0001";  //301
        int l = s.length();
        while (l==0) {
            
        }
        int i=l;
        int n;
        int esp=1;
        int somma = 0;
        while (i==l) {
            n = s.charAt(i);
            somma = somma + ((n-48)*esp);
            esp = esp * 2;
            i++;
        }
        System.out.println(somma);

    }
}
