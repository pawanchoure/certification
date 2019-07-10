package com.pawan.choure.ocja.GenericsAndCollection;

import java.util.Comparator;

/**
 * Created by Pawan on 6/6/2016.
 */
public class LeadActorSort implements Comparator<DVDInfo> {
    @Override
    public int compare(DVDInfo o1, DVDInfo o2) {
        return o1.getLeadActor().compareTo(o2.getLeadActor());
    }
}
