import java.util.Scanner;
import java.util.Locale;
 public class Program {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A,B,C,At,Ac,Atr,Aq,Ar,pi=3.14159;
        A= sc.nextDouble();
        B= sc.nextDouble();
        C= sc.nextDouble();

        At= A*C/2.0;
        Ac= pi* C*C;
        Atr= (A+B)*C/2.0;
        Aq= B*B;
        Ar= A*B;

        System.out.println("TRIANGULO: " +At);
        System.out.println("CÍRCULO: " + Ac);
        System.out.println("TRAPÉZIO: " + Atr);
        System.out.println("QUADRADO: " + Aq);
        System.out.println("RETANGULO "+ Ar);

        sc.close();
    }
}


