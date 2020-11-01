package edu.umsl;

class Fungi extends Creatures implements Reproduction {
    public String Fungi() {
        return "fungi";
    }

    @Override
    public String eatFood() {
        return "external digestion with hyphae";
    }
    @Override
    public String modeOfReproduction() {
        return "Spores";
    }
}
