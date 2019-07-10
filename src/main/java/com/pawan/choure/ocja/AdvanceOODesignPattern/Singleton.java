package com.pawan.choure.ocja.AdvanceOODesignPattern;

/**
 * Created by Pawan on 6/6/2016.
 */
public class Singleton {

    private static final Singleton INSTANCE= new Singleton();
    public static Singleton getInstance(){
        return INSTANCE;
    }
    private Singleton(){

    }
}
