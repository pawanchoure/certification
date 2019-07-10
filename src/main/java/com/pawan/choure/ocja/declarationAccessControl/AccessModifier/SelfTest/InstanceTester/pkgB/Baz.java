package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.SelfTest.InstanceTester.pkgB;


import com.pawan.choure.ocja.declarationAccessControl.AccessModifier.SelfTest.InstanceTester.pkgA.Foo;

/**
 * Created by Pawan on 6/4/2016.
 */
public class Baz {
    public static void main(String[] args){
        Foo f=new Foo();
        //System.out.println(f.a);
        //System.out.println(f.b);
        System.out.println(f.c);
    }
}
