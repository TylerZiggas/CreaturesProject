package edu.umsl;

class Animal extends Creatures implements Reproduction {
    public String Animal() {
        return "animal";
    }

    @Override
    public String eatFood() {
        return "ingestion";
    }
    @Override
    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }
}
