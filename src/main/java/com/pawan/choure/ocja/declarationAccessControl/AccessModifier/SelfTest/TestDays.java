package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.SelfTest;

/**
 * Created by Pawan on 6/4/2016.
 */
public class TestDays {
    public enum Days{MON,TUE,WED};
    public static void main(String[] args){
        for (Days d : Days.values());
        Days [] d2= Days.values();
        System.out.println(d2[2]);
    }
}
