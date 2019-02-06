package com.company;

public class Animal {

    private String name;
    private String species;
    private String gender;



    public Animal(String name, String species, String gender) {
        this.name = name;
        this.species = species;
        this.gender = gender;
    }

    public void printAnimal(){

        System.out.println("The " + species + " is named " + name + ", and is a " + gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




}
