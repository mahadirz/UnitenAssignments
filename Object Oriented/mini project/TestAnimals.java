/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Mahadir Ahmad
 */

public class TestAnimals {

    // init empty ArrayList
    private static ArrayList<Animal> elephantList = new ArrayList<Animal>();
    private static ArrayList<Animal> giraffeList = new ArrayList<Animal>();
    private static ArrayList<Animal> pandaList = new ArrayList<Animal>();

    public static void main(String args[]) {

        boolean exit = false;
        int choosedOption;
        String aOpt;
        
        Scanner s = new Scanner(System.in);

        do {

            //output the menu
            printMenu1();
            //get input from user
            aOpt = s.next();
            
            //process choice entered by user
            switch (aOpt.charAt(0)) {
                case 'A':
                case 'a':
                    printMenu2();
                    try {
                        choosedOption = s.nextInt();
                        processOptionA(choosedOption);
                    } catch (Exception e) {
                        System.out.println("Error,Please enter number only!");
                    }
                    break;
                case 'B':
                case 'b':
                    System.out.println("You have selected to print data.");
                    printMenu2();
                    try {
                        choosedOption = s.nextInt();
                        if (choosedOption == 1) {
                            //print elephant data
                            System.out.println("Record on elephant:");
                            printAnimal(elephantList);
                        } else if (choosedOption == 2) {
                            //print giraffe
                            System.out.println("Record on Giraffe:");
                            printAnimal(giraffeList);
                        } else {
                            //print panda
                            System.out.println("Record on Panda");
                            printAnimal(pandaList);
                        }
                    } catch (Exception e) {
                        System.out.println("Error,Please enter number only!");
                    }
                    break;
                case 'C':
                case 'c':
                    System.out.println("You have selected to delete data.");
                    printMenu2();
                    try {
                        choosedOption = s.nextInt();
                        deleteAnimalList(choosedOption);

                    } catch (Exception e) {
                        System.out.println("Error,Please enter number only!");
                    }
                    break;
                case 'D':
                case 'd':
                    exit = true;
                    break;
                default:
                    System.out.println("\nInvalid choice!\n");
                    break;

            }
            

        } while (exit == false);
        
        //close buffer
        s.close();
    }

    private static void deleteAnimalList(int choice) {
        boolean exit = false;
        int index;
        Scanner s = new Scanner(System.in);
        do {
            try {
                if (choice == 1) {
                    //delete elephant data
                    
                    if(elephantList.isEmpty()){
                        System.out.println("List empty\n\n");
                        return;
                    }
                    
                    System.out.print("Enter the index you want to delete: ");
                    index = s.nextInt(); 
                    
                    if (index > elephantList.size()) {
                        //try to access index out of bound
                        System.out.println("Warning! There are only " + elephantList.size() + " records for Elephant. Index \n"
                                + "must be between 0-" + (elephantList.size() - 1) + " only.");
                    } else {
                        //safe to delete
                        elephantList.remove(index);
                        System.out.println("Data at index " + index + " has been successfully deleted\n\n");
                        //exit to main menu
                        return;
                    }

                } else if (choice == 2) {
                    //delete giraffe data
                    if(elephantList.isEmpty()){
                        System.out.println("List empty");
                        return;
                    }
                    
                    System.out.print("Enter the index you want to delete: ");
                    index = s.nextInt();
                    
                    if (index > giraffeList.size()) {
                        //try to access index out of bound
                        System.out.println("Warning! There are only " + giraffeList.size() + " records for Elephant. Index \n"
                                + "must be between 0-" + (giraffeList.size() - 1) + " only.");
                    } else {
                        //safe to delete
                        giraffeList.remove(index);
                        System.out.println("Data at index " + index + " has been successfully deleted\n\n");
                        //exit to main menu
                        return;
                    }
                } else {
                    //delete panda data
                    if(elephantList.isEmpty()){
                        System.out.println("List empty");
                        return;
                    }
                    
                    System.out.print("Enter the index you want to delete: ");
                    index = s.nextInt();
                    
                    if (index > pandaList.size()) {
                        //try to access index out of bound
                        System.out.println("Warning! There are only " + pandaList.size() + " records for Elephant. Index \n"
                                + "must be between 0-" + (pandaList.size() - 1) + " only.");
                    } else {
                        //safe to delete
                        pandaList.remove(index);
                        System.out.println("Data at index " + index + " has been successfully deleted\n\n");
                        //exit to main menu
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error! Please enter number only");
            }

        } while (exit == false);



    }

    private static void printAnimal(ArrayList<Animal> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println((i + 1) + ". " + a.get(i));
        }
    }

    private static void printMenu1() {
        System.out.println("Enter the menu selection: ");
        System.out.println("[A] Enter data ");
        System.out.println("[B] Print data ");
        System.out.println("[C] Delete data ");
        System.out.println("[D] Exit ");
        System.out.print("Choose your selection : ");
    }

    private static void printMenu2() {
        System.out.println("Enter animal type: ");
        System.out.println(" [1] Elephant");
        System.out.println(" [2] Giraffe");
        System.out.println(" [3] Panda");
        System.out.println(" [4] Go to menu selection");
        System.out.print("Choose your animal type : ");
    }

    private static void processOptionA(int choice) {
        Scanner s = new Scanner(System.in);
        int num, age;
        String name;
        switch (choice) {
            case 1:
                System.out.println("You have selected to enter record on Elephant.");
                System.out.print("How many records do you want to enter? ");
                try {
                    num = s.nextInt();
                    for (int i = 1; i <= num; i++) {
                        System.out.println("Record " + i);
                        System.out.print("Enter the name: ");
                        name = s.next();
                        System.out.print("Enter the age: ");
                        age = s.nextInt();
                        //add new elephant to list
                        elephantList.add(new Animal(name, age));
                    }
                    System.out.println(num + " records have been successfully added.\n\n");
                } catch (Exception e) {
                    System.out.println("Error, Please enter number only!");
                } 

                break;

            case 2:
                System.out.println("You have selected to enter record on Giraffe.");
                System.out.print("How many records do you want to enter? ");
                try {
                    num = s.nextInt();
                    for (int i = 1; i <= num; i++) {
                        System.out.println("Record " + i);
                        System.out.print("Enter the name: ");
                        name = s.next();
                        System.out.print("Enter the age: ");
                        age = s.nextInt();
                        //add new elephant to list
                        giraffeList.add(new Animal(name, age));
                    }
                    System.out.println(num + " records have been successfully added.\n\n");
                } catch (Exception e) {
                    System.out.println("Error, Please enter number only!");
                } 
                break;

            case 3:
                System.out.println("You have selected to enter record on Panda.");
                System.out.print("How many records do you want to enter? ");
                try {
                    num = s.nextInt();
                    for (int i = 1; i <= num; i++) {
                        System.out.println("Record " + i);
                        System.out.print("Enter the name: ");
                        name = s.next();
                        System.out.print("Enter the age: ");
                        age = s.nextInt();
                        //add new elephant to list
                        pandaList.add(new Animal(name, age));
                    }
                    System.out.println(num + " records have been successfully added.\n\n");
                } catch (Exception e) {
                    System.out.println("Error, Please enter number only!");
                } 
                break;

            case 4:
                break;
        }

    }
}
