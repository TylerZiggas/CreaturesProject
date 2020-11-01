package edu.umsl;

public class Sunflower extends Plant {
    @Override
    public String toString() {
        String type = Plant();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String sunflower = "sunflower";
        return("I am a " + sunflower + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
