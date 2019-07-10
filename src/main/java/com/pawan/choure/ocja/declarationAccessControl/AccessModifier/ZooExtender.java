package com.pawan.choure.ocja.declarationAccessControl.AccessModifier;

/**
 * Created by Pawan on 6/4/2016.
 */
public class ZooExtender  extends Zoo{

    public void useMyCoolMethod(){
        System.out.println( this.coolMethod());
    }

    public static void main(String[] args){
        ZooExtender m = new ZooExtender();
        m.useMyCoolMethod();
    }
}
