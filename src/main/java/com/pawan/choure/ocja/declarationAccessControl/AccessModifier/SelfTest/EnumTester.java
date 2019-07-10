package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.SelfTest;

/**
 * Created by Pawan on 6/4/2016.
 */
public class EnumTester {
    static Animals a;
    public static void main(String[] args){
        System.out.println(a.DOG.sound+" "+a.CAT.sound);
    }
}

enum Animals{
    DOG("woof"),CAT("meow");
    String sound;
    Animals(String s) {
    sound=s;
    }
}
