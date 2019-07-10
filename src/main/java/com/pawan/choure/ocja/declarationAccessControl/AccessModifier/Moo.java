package com.pawan.choure.ocja.declarationAccessControl.AccessModifier;

/**
 * Created by Pawan on 6/4/2016.
 */
public class Moo {

    public void useAZoo(){
        Zoo z= new Zoo();
        z.coolMethod();
    }

    public static void main(String[] args){
        Moo m = new Moo();
        m.useAZoo();
    }
}
