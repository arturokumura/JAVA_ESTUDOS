import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

     double media;
    System.out.print("Quantos numeros voce vai digitar?");
        int n= sc.nextInt();

    double vect [] = new double [n];

    for (int i=0; i<n ; i++){
        System.out.print("Digite um numero: ");
        vect[i]= sc.nextDouble();
    }

        System.out.println("VALORES: ");

        for (int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }

        double soma =0;
        System.out.print("SOMA: ");
        for (int i = 0; i < n; i++) {
             soma += vect[i];
        }

        media= soma/n;




        System.out.println(soma);
        System.out.print("MEDIA: "+media);
        sc.close();



    }
}