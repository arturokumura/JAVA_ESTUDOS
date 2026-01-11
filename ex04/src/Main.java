import java.util.Scanner;

public class Main { // Define a classe principal
    public static void main(String[] args) { // Ponto de entrada do programa
   Scanner sc= new Scanner(System.in);
       double A,R,pi=3.14159;

       R = sc.nextDouble();
       A= pi * R * R;
       System.out.printf("A=%4f%n", A);
       sc.close();
    }
}
