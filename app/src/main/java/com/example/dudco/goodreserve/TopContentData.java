package com.example.dudco.goodreserve;

/**
 * Created by dudco on 2017. 3. 8..
 */

public class TopContentData {
    private String location;
    private String title;

    public TopContentData(String title, String location) {
        this.location = location;
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
