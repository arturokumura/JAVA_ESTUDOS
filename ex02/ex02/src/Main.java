

public class Main {
  public static void main(String[] args) {


        String product1 = "Computer";
        String product2 = "Ofice deck";

        int age = 30;
        int code = 0366;
        char gender= 'F';

        double price1 = 2100.00;
        double price2 = 560.00;
        double measure= 44.37253698;

        System.out.println ("Products:");
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.println(product2 + ", which price is $ " + price2);
        System.out.println();
        System.out.println("Recorde: " + age +" years old " + ", code " + code + " and gender: " + gender);
        System.out.println();
        System.out.println("Measue with eight decimal places: " + measure );
        System.out.print("Rounded (three decimal places): " );
        System.out.printf("%.3f", measure);
     


  }
}

