/*
 * Problem statement:
 * Create a Person class that stores a person's name and age, then prints an
 * introduction stating whether the person is an adult or a minor.
 *
 * Hint:
 * This class demonstrates encapsulation with private fields, initialization
 * through a constructor, and behavior through the introduce() method.
 * The ?: operator is a short form of a simple if/else condition.
 */
package com.spring.boot;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        String adultMessage = age >= 18 ? "an adult" : "a minor";
        return "My name is " + name + " and I am " + age + " years old. I am " + adultMessage + ".";
    }
}
