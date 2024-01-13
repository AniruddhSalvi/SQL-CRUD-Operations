package myPackage;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        while(true) {
            System.out.println("-- CRUD Operations of SQL --");
            System.out.println("1) Create ");
            System.out.println("2) Read ");
            System.out.println("3) Update ");
            System.out.println("4) Delete ");

            System.out.print("Enter Choice: ");
            Scanner sc=new Scanner(System.in);
            int choice = sc.nextInt();
            Operation op = new Operation();

                switch (choice) {
                    case 1: op.createData();
                        break;
                    case 2: op.readData();
                        break;
                    case 3: op.updateData();
                        break;
                    case 4: op.deleteData();
                        break;

                    default:System.out.println("Invalid Input.");
                        break;
                }
            if(choice == 5) {
                break;
            }
        }
    }
}