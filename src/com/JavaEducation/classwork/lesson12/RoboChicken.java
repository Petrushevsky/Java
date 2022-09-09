package com.JavaEducation.classwork.lesson12;

public class RoboChicken {
    public int weight;
    public int strength;
    public int age;
    public String name;

    RoboChicken(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public void fight(RoboChicken roboChicken) {
        if (this.strength > strength && this.age > age) {
            System.out.println(this.name + "is a winner");
        } else System.out.println(name + "is a winner");
    }
}
