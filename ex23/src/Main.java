import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int i;

      int n = sc.nextInt();
      for (i=0; i<n; i++){
          double a= sc.nextDouble();
          double b= sc.nextDouble();

          if (b!=0){
              double div= (double) a/b;
              System.out.println(div);
          } else {
              System.out.print (" Divisão impossível");
          }
      }
      sc.close();
    }
}