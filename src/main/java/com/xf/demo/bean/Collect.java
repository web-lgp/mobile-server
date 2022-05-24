package com.xf.demo.bean;

public class Collect {
    private String collect_userName;
    private int collect_id;

    public Collect(String collect_userName, int collect_id) {
        this.collect_userName = collect_userName;
        this.collect_id = collect_id;
    }

    public Collect() {
    }

    public String getCollect_userName() {
        return collect_userName;
    }

    public void setCollect_userName(String collect_userName) {
        this.collect_userName = collect_userName;
    }

    public int getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(int collect_id) {
        this.collect_id = collect_id;
    }
}
