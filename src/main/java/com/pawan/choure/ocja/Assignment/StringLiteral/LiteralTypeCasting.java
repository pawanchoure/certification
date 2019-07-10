package com.pawan.choure.ocja.Assignment.StringLiteral;

/**
 * Created by Pawan on 6/5/2016.
 */
public class LiteralTypeCasting {


    public static void main(String[] args){
        byte b1 = 4;
        int i1 = 123456;
        long L1 = (long)i1; // line A
        short s2 = (short)i1; // line B
        byte b2 = (byte)i1; // line C
        int i2 = (int)123.456; // line D
        System.out.println(i1 );
        System.out.println(L1 );
        System.out.println(s2);
        System.out.println(b2 );
        System.out.println(i2 );

        //byte b3 = b1 + 7; // line E
    }
}
