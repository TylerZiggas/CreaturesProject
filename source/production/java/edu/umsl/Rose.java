package edu.umsl;

public class Rose extends Plant {
    @Override
    public String toString() {
        String type = Plant();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String rose = "rose";
        return("I am a " + rose + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
