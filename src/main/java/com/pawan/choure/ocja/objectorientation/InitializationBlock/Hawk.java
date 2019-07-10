package com.pawan.choure.ocja.objectorientation.InitializationBlock;

/**
 * Created by Pawan on 6/5/2016.
 */
class Bird {

    {
        System.out.println("b1 ");
    }

    public Bird() {
        System.out.println("b2 ");
    }
}

class Raptor extends Bird{
    static {
        System.out.println("R1 ");
    }

    public Raptor() {
        System.out.println("R2 ");
    }
    {
        System.out.println("R3 ");
    }
    static {
        System.out.println("R4 ");
    }

}

public class Hawk extends Raptor{
public static void main(String[] args){
    System.out.println("Pre ");
    new Hawk();
    System.out.println("Hawk");
}
}