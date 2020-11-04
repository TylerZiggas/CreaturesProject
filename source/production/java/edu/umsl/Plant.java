package edu.umsl;

class Plant extends Creatures implements Reproduction{
    public String Plant() { // Constructor that returns what it is
        return "plant";
    }

    @Override
    public String eatFood() { // Override for plant type of food
        return "sunlight (aka photosynthesis)";
    }
    @Override
    public String modeOfReproduction() { // Override for plant type of reproduction
        return "Seeds";
    }
}
