import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();

        if (x % 2== 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
