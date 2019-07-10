package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.SelfTest;

/**
 * Created by Pawan on 6/4/2016.
 */
public class ExtendClass extends Hobbit {
public static void main(String[] args){
    int myGold=7;
  //  System.out.println(countGold(myGold,6));

}
}

class Hobbit{
    int countGold(int x,int y){
        return x+y;
    }
}
