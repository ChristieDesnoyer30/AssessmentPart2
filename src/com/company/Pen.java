package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pen {

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<BabyAnimal> babies = new ArrayList<>();
    ArrayList<Animal> animalPen = new ArrayList<>();

    public void addAnimalsToPen() {

        boolean addAnimals = true;

        Scanner scan = new Scanner(System.in);


        System.out.println("What kind of species will go in the pen? ");

        String animalSpecies = scan.nextLine();

        do {
            System.out.println("Press 1 to add an  Adult Animal or press 2 to add a Baby animal? 3. To complete adding animals.");

            int userChoice = scan.nextInt();

            if (userChoice == 1) {

                System.out.println("Enter the animals name: ");

                scan.nextLine();

                String animalName = scan.nextLine();


                System.out.println("Enter the animals gender: ");

                String animalGender = scan.nextLine();

                Animal a = new Animal(animalName, animalSpecies, animalGender);

                animals.add(a);

                a.printAnimal();

            } else if (userChoice == 2) {

                System.out.println("Enter the  baby animals name: ");

                scan.nextLine();

                String babyName = scan.nextLine();

                System.out.println("Enter the baby's gender: ");

                String babyGender = scan.nextLine();

                System.out.println("Enter the day the baby was born: ");

                String birthDay = scan.nextLine();

                BabyAnimal b = new BabyAnimal(babyName, animalSpecies, babyGender, birthDay);

                babies.add(b);

                b.printAnimal();

            } else if (userChoice == 3) {

                System.out.println("Done adding animals, lets create your pen.");

                createPen();

                addAnimals = false;

            } else {

                System.out.println("Not a valid option. Try again.");
            }


        } while (addAnimals);


    }


    public void createPen() {


        for (Animal a : animals) {
            animalPen.add(a);
        }

        for (BabyAnimal b : babies) {
            animalPen.add(b);
        }


          printPenDetails();
        }


    public void printPenDetails(){
            System.out.println("Here are the animals in your " + animals.get(0).getSpecies() + " pen");

        for (Animal ab : animalPen) {

        ab.printAnimal();

    }


}

public void clearPen(){

        for(Animal ab : animalPen){

            animalPen.remove(ab);
        }
}


}
