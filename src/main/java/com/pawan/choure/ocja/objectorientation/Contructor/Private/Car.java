package com.pawan.choure.ocja.objectorientation.Contructor.Private;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Car {
    protected Car(){
        System.out.println("Car protected");
    }
    public Car(String name){
        System.out.println("Car public");
    }
}
