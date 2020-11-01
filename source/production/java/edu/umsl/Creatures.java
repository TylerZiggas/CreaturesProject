package edu.umsl;

import java.util.List;
import java.util.ArrayList;

interface Reproduction{
    String modeOfReproduction();
}
abstract class Creatures {
    abstract String eatFood();

    public static void main(String args[]) {
        Sunflower sunflower = new Sunflower();
        Rose rose = new Rose();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Portobello portobello = new Portobello();
        Shiitake shiitake = new Shiitake();

        List<Plant> plants = new ArrayList<>();
        plants.add(sunflower);
        plants.add(rose);
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        List<Fungi> fungi = new ArrayList<>();
        fungi.add(portobello);
        fungi.add(shiitake);

        for(Plant tmp: plants) {
            System.out.println(tmp);
        }

        for(Animal tmp: animals) {
            System.out.println(tmp);
        }

        for(Fungi tmp: fungi) {
            System.out.println(tmp);
        }
    }
}
