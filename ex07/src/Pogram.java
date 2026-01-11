import java.util.Scanner;
public class Pogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1,n1,cod2,n2;
        double v1,v2,total;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();

        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        total = v1 * n1 + v2 * n2;

        System.out.println("VALOR A PAGAR: R$ "+ total);

        sc.close();
    }
}