import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     int i= sc.nextInt();
     int f= sc.nextInt();

        int duracao;
        if (i < f) {
            duracao = f - i;
        }
        else {
            duracao = 24 - i + f;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();

     }

    }

