package com.pawan.choure.ocja.GenericsAndCollection;

import java.util.Comparator;

/**
 * Created by Pawan on 6/6/2016.
 */
@SuppressWarnings("ALL")
public class GenreSort implements Comparator<DVDInfo> {

    @Override
    public int compare(DVDInfo o1, DVDInfo o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }

    @Override
    public Comparator<DVDInfo> reversed() {
        return null;
    }
}
