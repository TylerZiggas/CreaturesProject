package edu.umsl;

public class Dog extends Animal {
    @Override
    public String toString() {
        String type = Animal();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String dog = "dog";
        return("I am a " + dog + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
