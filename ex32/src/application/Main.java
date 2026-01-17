package application;
import calculator.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc= new CurrencyConverter();
    System.out.print("What is the dollar price?");
    cc.DOLLAR= sc.nextDouble();
    System.out.print("How many dollars will be bought? ");
    cc.n= sc.nextDouble();
    System.out.print("Amount to be paid in reais = " + cc.Calculator());
    }
}
