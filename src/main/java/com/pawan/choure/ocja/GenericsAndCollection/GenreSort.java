package com.pawan.choure.ocja.GenericsAndCollection;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created by Pawan on 6/6/2016.
 */
@SuppressWarnings("ALL")
public class GenreSort implements Comparator<DVDInfo> {


    @Override
    public int compare(DVDInfo dvdInfo, DVDInfo t1) {
        return dvdInfo.getGenre().compareTo(t1.getGenre());
    }

    @Override
    public Comparator<DVDInfo> reversed() {
        return null;
    }

    @Override
    public Comparator<DVDInfo> thenComparing(Comparator<? super DVDInfo> other) {
        return null;
    }

    @Override
    public <U> Comparator<DVDInfo> thenComparing(Function<? super DVDInfo, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<DVDInfo> thenComparing(Function<? super DVDInfo, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<DVDInfo> thenComparingInt(ToIntFunction<? super DVDInfo> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<DVDInfo> thenComparingLong(ToLongFunction<? super DVDInfo> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<DVDInfo> thenComparingDouble(ToDoubleFunction<? super DVDInfo> keyExtractor) {
        return null;
    }
}
