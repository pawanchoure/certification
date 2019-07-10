package com.pawan.choure.ocja.objectorientation.Polymorphism;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Tester {
    public static void main(String[] args) throws Exception {
        Animal animal= new Animal();
         // Dog a= new Animal(); Will Not Work
        Animal dog= new Dog();
        Animal horse= new Horse();
        Dog dog1= new Dog();
        animal.eat();
        dog.eat();
        // dog.bark(); Will Not Work
        dog1.bark();

     }
}
