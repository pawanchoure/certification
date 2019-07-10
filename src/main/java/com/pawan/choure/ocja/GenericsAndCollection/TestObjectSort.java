package com.pawan.choure.ocja.GenericsAndCollection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Pawan on 6/6/2016.
 */
public class TestObjectSort {
    public static void main(String[] args) {
        ArrayList<DVDInfo> stuff = new ArrayList<DVDInfo>(); // #1
        stuff.add(new DVDInfo("Ball","Comedy","Pawan"));
        stuff.add(new DVDInfo("All","Drama","Hrishi"));
        System.out.println("unsorted " + stuff);
        Collections.sort(stuff); // #2
        System.out.println("sorted " + stuff);

        GenreSort genreSort= new GenreSort();
        Collections.sort(stuff,genreSort);
        System.out.println("GenreSort " + stuff);

        LeadActorSort leadActorSort= new LeadActorSort();
        Collections.sort(stuff,leadActorSort);
        System.out.println("LeadActor " + stuff);
    }
}
