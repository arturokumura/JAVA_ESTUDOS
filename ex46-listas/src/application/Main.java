package application;

import entities.Emplyooe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Emplyooe> list = new ArrayList<>();

     System.out.print("How many employes will be registered? ");
     int n = sc.nextInt();

     for (int i=0; i<n; i++) {
         System.out.print("Emplyoee #" + (1+i) + " :");
         System.out.print("Id: ");
         Integer id = sc.nextInt();
         System.out.print("Name: ");
         sc.nextLine();
         String name = sc.nextLine();
         System.out.print("Salary: ");
         Double salary = sc.nextDouble();

         Emplyooe emp = new Emplyooe(id, name, salary);

         list.add(emp);
     }

     System.out.print("Enter the emplotee id that will have salary increase : ");
     Integer idsalary = sc.nextInt();
        Integer pos = hasId(list,idsalary);
     if (pos== null) {
         System.out.println("Esse id does not exist! ");
     } else {
         System.out.print("Enter the porcentage: ");
         double percent = sc.nextDouble();
         list.get(pos).increasySalary(percent);
     }
     System.out.println();
     System.out.println("List of employees: ");
     for (Emplyooe emp : list){
         System.out.println(emp);
     }


     sc.close();
    }


    public static Integer hasId(List<Emplyooe> list, int id) {
         for (int i = 0; i< list.size(); i++) {
             if (list.get(i).getId() == id){
                 return i;
             }
         }
         return null;
    }
}