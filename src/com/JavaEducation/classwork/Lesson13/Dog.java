package com.JavaEducation.classwork.Lesson13;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("WooF Woof");
        action();
    }

    private void action() {
        System.out.println("виляет хвостом");
    }
}
