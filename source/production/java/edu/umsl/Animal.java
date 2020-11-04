package edu.umsl;

class Animal extends Creatures implements Reproduction {
    public String Animal() { // Constructor that returns what it is
        return "animal";
    }

    @Override
    public String eatFood() { // Override for animal type of food
        return "ingestion";
    }
    @Override
    public String modeOfReproduction() { // Override for animal type of reproduction
        return "Sexual Reproduction";
    }
}
