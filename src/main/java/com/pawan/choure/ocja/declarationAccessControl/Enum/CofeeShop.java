package com.pawan.choure.ocja.declarationAccessControl.Enum;

/**
 * Created by Pawan on 6/4/2016.
 */
public class CofeeShop {

    public static void main(String[] args){
        Coffee drink= new Coffee();
        drink.size=CofeeSize.BIG;
    }
}

class Coffee {
    CofeeSize size;
}

enum CofeeSize {BIG,SMALL,OVERWHELMING}
