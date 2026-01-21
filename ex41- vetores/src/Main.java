import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();}

            int somap=0;
        int np=0;
            for ( int i =0 ; i<n; i++) {
                if (vetor[i] % 2 == 0) {
                    somap += vetor[i];
                    np++;
                } else {
                    System.out.print("NENHUM NUMERO PAR");
                }

            }
}}