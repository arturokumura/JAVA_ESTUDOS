import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.print("Quantos numeros voce vai digitar? ");
        int N= sc.nextInt();

        int [] vect = new int[6];

    for (i=0; i<N; i++){
        System.out.print("Digite um numero: ");
        vect[i] = sc.nextInt();
    }

        System.out.println("NUMEROS NEGATIVOS: ");
    for ( i=0; i<N; i++){
    if (vect[i]< 0){
        System.out.println(vect[i]);
    }
    sc.close();
    }}
}