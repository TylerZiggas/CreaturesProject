package edu.umsl;

public class Shiitake extends Fungi {
    @Override
    public String toString() {
        String type = Fungi();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String shiitake = "shiitake";
        return("I am a " + shiitake + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
