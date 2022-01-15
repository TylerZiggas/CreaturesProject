package edu.umsl;

import java.util.List;
import java.util.ArrayList;

interface Reproduction { // Reproduction interface
    String modeOfReproduction();
}
abstract class Creatures {
    abstract String eatFood();

    public static void main(String args[]) {
        Sunflower sunflower = new Sunflower(); // Create all of the subclasses, the two plants
        Rose rose = new Rose();
        Dog dog = new Dog(); // The two animals
        Cat cat = new Cat();
        Portobello portobello = new Portobello(); // The two fungi
        Shiitake shiitake = new Shiitake();

        List<Plant> plants = new ArrayList<>(); // Create and store the plants in a plant list
        plants.add(sunflower);
        plants.add(rose);
        List<Animal> animals = new ArrayList<>(); // Create and store the animals in an animal list
        animals.add(dog);
        animals.add(cat);
        List<Fungi> fungi = new ArrayList<>(); // Create and store the fungi in a fungus list
        fungi.add(portobello);
        fungi.add(shiitake);

        for(Plant tmp: plants) { // Print the plants
            System.out.println(tmp);
        }

        for(Animal tmp: animals) { // Print the animals
            System.out.println(tmp);
        }

        for(Fungi tmp: fungi) { // Print the fungi
            System.out.println(tmp);
        }
    }
}
