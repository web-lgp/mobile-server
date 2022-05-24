package com.xf.demo.bean;

public class MyTracks {
    private String myTracks_userName;
    private int myTracks_id;

    public MyTracks(String myTracks_userName, int myTracks_id) {
        this.myTracks_userName = myTracks_userName;
        this.myTracks_id = myTracks_id;
    }

    public MyTracks() {
    }

    public String getMyTracks_userName() {
        return myTracks_userName;
    }

    public void setMyTracks_userName(String myTracks_userName) {
        this.myTracks_userName = myTracks_userName;
    }

    public int getMyTracks_id() {
        return myTracks_id;
    }

    public void setMyTracks_id(int myTracks_id) {
        this.myTracks_id = myTracks_id;
    }
}
