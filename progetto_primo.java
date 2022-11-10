import java.util.Scanner;
public class progetto_primo
    public static void main(String[] args) 
    {
  
      Scanner scanner= new Scanner(System.in);
      {
      int num;
      int temp;
      int resto;

      System.out.println("###################################");
      System.out.println("#     DECIMALE BINARIO        #");
      System.out.println("###################################")

      System.out.println("###################################");

      System.out.println("Insrisci il numero da convertire"):
      num = scanner.nextInt();
      temp=num;
      while (temp > 0)
      {
            resto= temp%2;
            temp=temp/2
            System.out.println(""+ resto);
            
      }
        }
    }