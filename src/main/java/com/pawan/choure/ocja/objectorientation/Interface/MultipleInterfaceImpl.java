package com.pawan.choure.ocja.objectorientation.Interface;

import java.io.FileNotFoundException;

/**
 * Created by Pawan on 6/5/2016.
 */
public class MultipleInterfaceImpl implements Bounceable,Rollable {
    @Override
    public void bounce() {
        System.out.print("Bounce");
    }




    public static void main(String[] args) throws FileNotFoundException {
        Bounceable b= new MultipleInterfaceImpl();
        b.bounce();
        Rollable r= new MultipleInterfaceImpl();
        r.bounce();
    }
}
