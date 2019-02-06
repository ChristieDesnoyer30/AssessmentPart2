package com.company;

import java.util.Scanner;

public class ZooDemo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean userContinue = true;
        int userOption;
        Pen animalPen = new Pen();
        Zoo zoo = new Zoo();

        System.out.println("Welcone to the jungle, er, I mean, zoo! \n" +
                "Let's create your own thriving zoo! \n");


        do{

            System.out.println(

                    "Would you like to: \n" +
                    "1. Add a pen. \n" +
                    "2. Remove a Pen. \n" +
                    "3. Add an animal to an existing pen. \n" +
                    "4. Add a baby animal to an existing pen. \n" +
                    "5. Display all animals in a pen. \n" +
                    "6. Display the whole zoo. \n" +
                    "7. Exit. ");
            userOption = scan.nextInt();

            switch(userOption){

                case 1:

                    //Create a pen and add animals to it.
                    animalPen.addAnimalsToPen();

                    //add Pen to the zoo;
                    zoo.addPenToZoo(animalPen);

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    zoo.printZoo();

                    break;
                case 7:

                    System.out.println("Thank you for visitng the zoo.");
                    userContinue = false;
                    break;




            }


        } while (userContinue);




        System.out.println("Have a great day.");
    }
}
