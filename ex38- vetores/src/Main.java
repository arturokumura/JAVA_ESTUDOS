import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vao ter cada vetor? ");
        int n= sc.nextInt();

        System.out.println("Digite os valores de A: ");
        int vecA[] = new int[n];

        for(int i= 0; i<n; i++){
             vecA[i]= sc.nextInt();
        }

        System.out.println("Digite os valores de B: ");
        int vecB[] = new int[n];

        for(int i= 0; i<n; i++){
            vecB[i]= sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        int vecC[] = new int[n];

        for(int i= 0; i<n; i++){
            vecC[i]= vecA[i] + vecB[i];
            System.out.println(vecC[i]);
        }

    }
}