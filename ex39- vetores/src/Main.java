import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double vec[] = new double[n];
         double soma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vec[i] = sc.nextDouble();
             soma += vec[i];
        }

        double media =  soma/n;
        System.out.println("MEDIA DO VETOR = " + media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i=0; i<n; i++){
        if (vec[i] < media) {
            System.out.println(vec[i]);
        }
    }
}}