package com.JavaEducation.classwork.lesson12;

//public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
public class PersonalController {
    public static void main(String[] args) {
        Person person = new Person("Marianna", 33);
        Person person2 = new Person("Marianna2", 332);

        System.out.println(person);
        System.out.println(person2);
        person2.setAge(2);
        System.out.println(Person.COUNT);
        System.out.println(person2.getName());
        System.out.println(person2);
    }
}
