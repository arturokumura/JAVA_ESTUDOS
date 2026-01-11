import java.util.Scanner;
public class uri1008 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
  int n,nh;
  double vh, s;

  n =sc.nextInt();
  nh =sc.nextInt();
  vh =sc.nextDouble();

 s= vh * nh;

  System.out.println("NUMERO: " + n);
  System.out.println("SALÁRIO:$ " +  s);

  sc.close();
  }
}

