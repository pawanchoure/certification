package com.pawan.choure.ocja.Assignment.Static;

/**
 * Created by Pawan on 6/5/2016.
 */
public class Mirror {
    int size = 7;
    public static void main(String[] args) {
        Mirror m1 = new Mirror();
        Mirror m2 = m1;
        int i1 = 10;
        int i2 = i1;
        i2=go(m2, i2);
        System.out.println(m1.size + " " + i2);
    }
    static int go(Mirror m, int i) {
        m.size = 8;
        i = 12;
        return i;
    }
}
