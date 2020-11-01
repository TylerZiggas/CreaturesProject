package edu.umsl;

class Plant extends Creatures implements Reproduction{
    public String Plant() {
        return "plant";
    }

    @Override
    public String eatFood() {
        return "sunlight (aka photosynthesis)";
    }
    @Override
    public String modeOfReproduction() {
        return "Seeds";
    }
}
