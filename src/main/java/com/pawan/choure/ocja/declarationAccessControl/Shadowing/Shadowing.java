package com.pawan.choure.ocja.declarationAccessControl.Shadowing;

/**
 * Created by Pawan on 6/4/2016.
 */
public class Shadowing {
    int count=9;
    public void login(){
        int count =10;
        System.out.println("Local variable count is "+ count);
    }
    public void count(){
        System.out.println("Instance variable is "+count);
    }

    public static void main(String[] args){
        new Shadowing().login();
        new Shadowing().count();
    }
}
