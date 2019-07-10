package com.pawan.choure.ocjp8.chapter1;

/**
 * Created by Pawan on 30-05-2019.
 */
public class Parent {
    protected int x=9;
}

class Child extends Parent {
    public static void main(String[] args){
          //System.out.print(x);

        Parent p = new Parent();
        System.out.print(p.x);
    }
}