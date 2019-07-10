package com.pawan.choure.ocja.GenericsAndCollection;

/**
 * Created by Pawan on 6/6/2016.
 */
public class DVDInfo implements Comparable<DVDInfo>
{
    String title;
    String genre;
    String leadActor;

    public DVDInfo(String title, String genre, String leadActor) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
    }

    public DVDInfo() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }


    @Override
    public int compareTo(DVDInfo o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return "DVDInfo{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", leadActor='" + leadActor + '\'' +
                '}';
    }
}
