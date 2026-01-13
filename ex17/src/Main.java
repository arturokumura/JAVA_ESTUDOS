import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    int x= sc.nextInt();


    while (x!=2002) {
        System.out.println("SENHA INVÁLIDA");
       x= sc.nextInt();
    }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}