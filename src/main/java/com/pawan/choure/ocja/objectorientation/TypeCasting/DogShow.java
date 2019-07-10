package com.pawan.choure.ocja.objectorientation.TypeCasting;


import com.pawan.choure.ocja.objectorientation.InitializationBlock.Hawk;

/**
 * Created by Pawan on 6/5/2016.
 */

class Dog{
    public void bark(){
        System.out.println("woof ");
    }
}

class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
    public void bark(){
        System.out.println("howl ");
    }
}

public class DogShow {

    public static void main(String[] args){
         new DogShow().go();
        System.out.println("Pre ");
        new Hawk();
        System.out.println("Hawk");
    }

    private void go() {
        new Hound().bark();
        ((Dog)new Hound()).bark();
        //((Dog)new Hound()).sni();
    }
}
