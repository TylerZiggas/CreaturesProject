package edu.umsl;

class Fungi extends Creatures implements Reproduction {
    public String Fungi() { // Constructor that returns what it is
        return "fungi";
    }

    @Override
    public String eatFood() { // Override for fungi type of food
        return "external digestion with hyphae";
    }
    @Override
    public String modeOfReproduction() { // Override for fungi type of reproduction
        return "Spores";
    }
}
