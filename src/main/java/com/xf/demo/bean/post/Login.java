package com.xf.demo.bean.post;

public class Login {
    private String name;
    private String pwd;

    public Login(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Login() {
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

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
