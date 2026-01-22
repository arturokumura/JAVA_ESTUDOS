import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serao digitados? ");
    int n= sc.nextInt();
    sc.nextLine();


    String name[] = new String[n];
    Double nota1[] = new Double[n];
    Double nota2[] = new Double[n];

    for (int i = 0; i<n; i++){
        System.out.println("Digite nome, primeira e segunda nota do aluno: ");
         name[i] = sc.nextLine();

        nota1[i] = sc.nextDouble();
        nota2[i] = sc.nextDouble();
        sc.nextLine();

    }
        System.out.println("Alunos aprovados: ");
    for (int i=0; i<n; i++){
        double media= (nota1[i]+nota2[i])/2;
        if (media> 6.0){
            System.out.println( name[i]);
        }
    }

    }
}