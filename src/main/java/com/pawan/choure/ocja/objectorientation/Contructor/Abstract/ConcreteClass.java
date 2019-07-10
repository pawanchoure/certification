package com.pawan.choure.ocja.objectorientation.Contructor.Abstract;

/**
 * Created by Pawan on 6/5/2016.
 */
public class ConcreteClass extends AbstractClass {
    public ConcreteClass(){
        System.out.println("Concrete Class");
    }

    public static void main(String[] args){
        AbstractClass c= new ConcreteClass();

    }
}
