package com.pawan.choure.ocjp8.chapter1;

/**
 * Created by Pawan on 30-05-2019.
 */
public class SportsCar {
    void goFast(){
        System.out.println("go Fast");
    }

    void doStuff(){
        System.out.println("do Stuff");
        goFast();
    }
}

class Convertible extends SportsCar{

    void doThings(){
        SportsCar sportsCar= new SportsCar();
        sportsCar.goFast();
    }

    public static void main(String[] args){
        Convertible sportsCar= new Convertible();
        sportsCar.goFast();
    }
}
