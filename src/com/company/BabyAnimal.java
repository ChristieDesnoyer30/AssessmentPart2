package com.company;

public class BabyAnimal extends Animal {

    private String birthDate;

    public BabyAnimal(String name, String species, String gender, String birthDate) {
        super(name, species, gender);
        this.birthDate = birthDate;
    }

    @Override
    public void printAnimal(){
        System.out.println( "This is a baby " + getGender()+ " " + getSpecies() + ", named" + getName() + "."
        + "They were born in the zoo on " + birthDate);
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    
}
