package com.pawan.choure.ocja.objectorientation.Overriding;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Bar extends Foo {
    String go(int j){
        System.out.println("Bar:go");
        return "";
    }

    String get(){
        System.out.println("Bar:get");
        return "";
    }

    public static void main(String[] args){
        Bar b= new Bar();
        b.get();
        b.go();
        b.go(1);
        Foo fooBar= new Bar();
        fooBar.get();
        fooBar.go();
        if(fooBar instanceof Bar){
            ((Bar)fooBar).go(1);
        }
        Foo foo= new Foo();
        foo.get();
        foo.go();
    }
}
