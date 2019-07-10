package com.pawan.choure.ocja.objectorientation.Interface;

import java.io.FileNotFoundException;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Ball implements Bounceable {
    @Override
    public void bounce() {
        System.out.println("Bounce");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Bounceable b= new Ball();
        b.bounce();
    }
}
