package com.pawan.choure.ocja.objectorientation.InitializationBlock;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Init {

    Init(){
        System.out.println("Init Constructor");
    }

    static {
        System.out.println("Static 1");
    }

    static {
        System.out.println("Static 2");
    }

    public static void main(String[] args)  {
         new Init();
         new Init();
    }
}
