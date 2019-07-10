package com.pawan.choure.ocja.declarationAccessControl.AccessModifier.ProtectedDefault.SomethingElse;


import com.pawan.choure.ocja.declarationAccessControl.AccessModifier.ProtectedDefault.Other.OtherClass;

/**
 * Created by Pawan on 6/4/2016.
 */
public class AccessClass extends OtherClass {

    public static void main(String[] args){
        OtherClass o = new OtherClass();
        //o.test();
        //o.test() Will Not Work
        AccessClass a= new AccessClass();
        a.test();
        final int b=0;

    }




}
