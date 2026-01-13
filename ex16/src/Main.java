import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    double sal= sc.nextDouble();
    double imp;
        if (sal > 0 && sal < 2000) {
        System.out.println("Isento");
    }   else if (sal >2000.01 && sal< 3000){
            imp= (sal-2000)*0.08;
            System.out.println("R$: " + imp);
        } else if (sal> 3000.01 && sal<4500) {
            imp = (sal - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.println("R$: " + imp);
        } else {
            imp = (sal - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.println("R$: "+imp);
        }
    }
}