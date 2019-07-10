package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.PrivateMethodOverriding;

/**
 * Created by Pawan on 6/4/2016.
 */
public class Shuttle extends Rocket{
public static void main(String[] args){
    new Shuttle().go();
}

    private void go() {
    blastOff();
    }

    private void blastOff() {
        System.out.println("Rocket Bang");
    }
}

class Rocket {
    private void blastoff(){
        System.out.println("Bang");
    }
}
