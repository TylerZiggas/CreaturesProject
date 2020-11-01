package edu.umsl;

public class Cat extends Animal {
    @Override
    public String toString() {
        String type = Animal();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String cat = "cat";
        return("I am a " + cat + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
