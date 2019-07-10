package com.pawan.choure.ocja.declarationAccessControl.Interface.FinalVaraibleTester;


/**
 * Created by Pawan on 6/4/2016.
 */
public class Zap implements Foo {

    @Override
    public void go() {
        //BAR=27;   //Cannot Assign value to Final Variable
    }
}
