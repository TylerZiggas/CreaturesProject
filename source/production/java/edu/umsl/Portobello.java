package edu.umsl;

public class Portobello extends Fungi {
    @Override
    public String toString() {
        String type = Fungi();
        String food = eatFood();
        String reproduction = modeOfReproduction();
        String portobello = "portobello";
        return("I am a " + portobello + " which is a "+ type + ". I eat by " + food + " and reproduce by " + reproduction);
    }
}
