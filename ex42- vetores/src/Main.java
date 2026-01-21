import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String name [] = new String[n];
        int idade[] = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("Dados da " + (i+1) +"° pessoa: ");
            System.out.print("Nome: ");
            name[i] = sc.nextLine();
            sc.nextLine(); // limpa ENTER
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        int posmaior = 0;
         int maior=0;
        for (int i=1; i<n; i++){
            if (idade[i]> maior){
                maior=idade[i];
                posmaior =i;
            }
        }

        System.out.print("Pessoa mais velha: " + name[posmaior]);
    }
}
