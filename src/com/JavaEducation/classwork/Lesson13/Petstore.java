package com.JavaEducation.classwork.Lesson13;

import java.util.ArrayList;
import java.util.List;

import static com.JavaEducation.classwork.Lesson13.Animal.DEFAULT_COLOR;

public class Petstore {
    public static void main(String[] args) {
        Animal cat = new Cat("red", DEFAULT_COLOR);
        // cat.speak();
        Animal dog = new Dog();
        Animal cat2 = new Cat("Black", DEFAULT_COLOR);

        //dog.speak();

        Animal[] animals1 = new Animal[2];
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);
        animals.add(new Rat("Multicolor"));
        handleAnimals(animals);
    }

    private static void handleAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.speak();
            if (animal instanceof Rat) {
                Rat rat = (Rat) animal;
                rat.steal();
            }
        }
    }
}
