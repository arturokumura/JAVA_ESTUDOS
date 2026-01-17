package application;

import java.util.Locale;
import entities.student;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
       student st = new student();

       System.out.print("Nome: ");
       st.name= sc.nextLine();
       System.out.print("Nota 1°semestre: ");
       st.nota1= sc.nextDouble();
       System.out.print("Nota 2°semestre: ");
       st.nota2= sc.nextDouble();
       System.out.print("Nota 3°semestre: ");
       st.nota3= sc.nextDouble();
       System.out.println("Final garde = " + st.notafinal());

       if (st.notafinal() >60.00){
           System.out.println("PASS");
       } else {
           System.out.println("FAILED");
           System.out.print("MISSING " + st.missing()+ " POINTS");
       }
}}