package com.xf.demo.bean;

public class AddShoppingCart {
    private String addShoppingCart_userName;
    private Integer id;
    private Integer addShoppingCart_num;
    private Integer check;

    public AddShoppingCart(String addShoppingCart_userName, Integer id, Integer addShoppingCart_num, Integer check) {
        this.addShoppingCart_userName = addShoppingCart_userName;
        this.id = id;
        this.addShoppingCart_num = addShoppingCart_num;
        this.check = check;
    }

    public AddShoppingCart() {
    }

    public String getAddShoppingCart_userName() {
        return addShoppingCart_userName;
    }

    public void setAddShoppingCart_userName(String addShoppingCart_userName) {
        this.addShoppingCart_userName = addShoppingCart_userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddShoppingCart_num() {
        return addShoppingCart_num;
    }

    public void setAddShoppingCart_num(Integer addShoppingCart_num) {
        this.addShoppingCart_num = addShoppingCart_num;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }
}

