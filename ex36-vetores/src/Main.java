import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n= sc.nextInt();
        int np;
        int vect[]= new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        np=0;
        System.out.print("NUMEROS PARES:");
        for (int i=0; i<n; i++ ) {
            if (vect[i]%2==0){

                System.out.print(vect[i] + " ");
                np++;
            }
        }
     System.out.printf("QUANTIDADE DE PARES: ");
        System.out.print(np);
    }
}