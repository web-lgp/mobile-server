package com.xf.demo.bean;

public class Admin{
    private String name;
    private String pwd;
    private String img;
    private Integer id;

    public Admin() {

    }

    public Admin(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Admin(String name, String pwd, String img, Integer id) {
        this.name = name;
        this.pwd = pwd;
        this.img = img;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}