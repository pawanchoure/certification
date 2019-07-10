package com.pawan.choure.ocja.objectorientation.Contructor;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Horse extends Animal {
    Horse(){
        System.out.println("Horse No Args");
    }

    Horse(String name){
       // super(name);
        System.out.println("Horse Name"+name);
    }

    public static void main(String[] args){
        new Horse();
        new Horse("Raj");
    }
}
