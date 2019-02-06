package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pen {

    private ArrayList<Animal> animals;
    private ArrayList<BabyAnimal> babies;

    public Pen(){

    }


    public Pen(ArrayList<Animal> animals, ArrayList<BabyAnimal> babies) {
        this.animals = animals;
        this.babies = babies;
    }

    public void addAnimalsToPen() {

        boolean addAnimals = true;

        Scanner scan = new Scanner(System.in);


        do {

            System.out.println("Press 1 to add an  Adult Animal or press 2 to add a Baby animal? 3. To complete adding animals.");

            int userChoice = scan.nextInt();

            if (userChoice == 1) {

                addAnimal();

            } else if (userChoice == 2) {

             addBaby();

            } else if (userChoice == 3) {

                System.out.println("Done adding animals, lets create your pen.");

                createPen();

                addAnimals = false;

            } else {

                System.out.println("Not a valid option. Try again.");
            }


        } while (addAnimals);


    }

    private void addBaby() {

        Scanner scan = new Scanner(System.in);


        System.out.println("What kind of species will go in the pen? ");
        String animalSpecies = scan.nextLine();

        System.out.println("Enter the  baby animals name: ");

        String babyName = scan.nextLine();

        System.out.println("Enter the baby's gender: ");

        String babyGender = scan.nextLine();

        System.out.println("Enter the day the baby was born: ");

        String birthDay = scan.nextLine();

        BabyAnimal b = new BabyAnimal(babyName, animalSpecies, babyGender, birthDay);

        babies.add(b);

        b.printAnimal();
    }

    private void addAnimal() {

        Scanner scan = new Scanner(System.in);

        System.out.println("What kind of species will go in the pen? ");

        String animalSpecies = scan.nextLine();

        System.out.println("Enter the animals name: ");

        String animalName = scan.nextLine();


        System.out.println("Enter the animals gender: ");

        String animalGender = scan.nextLine();

        Animal a = new Animal(animalName, animalSpecies, animalGender);

        animals.add(a);

        a.printAnimal();

    }


    public Pen createPen() {

        Pen p = new Pen(animals, babies);


        return p;


    }


}
