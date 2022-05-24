package com.xf.demo.bean;

public class Commodity {
    private String img;
    private String name;
    private double price;
    private int id;
    private int repertor;
    private String productDescribe;
    private int addShoppingCart_num;

    public int getAddShoppingCart_num() {
        return addShoppingCart_num;
    }

    public void setAddShoppingCart_num(int addShoppingCart_num) {
        this.addShoppingCart_num = addShoppingCart_num;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepertor() {
        return repertor;
    }

    public void setRepertor(int repertor) {
        this.repertor = repertor;
    }

    public Commodity(String img, String name, double price, int id, int repertor, String productDescribe) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.id = id;
        this.repertor = repertor;
        this.productDescribe = productDescribe;
    }

    public Commodity(String img, String name, double price, int id, int repertor, String productDescribe, int addShoppingCart_num) {
        this.img = img;
        this.name = name;
        this.price = price;
        this.id = id;
        this.repertor = repertor;
        this.productDescribe = productDescribe;
        this.addShoppingCart_num = addShoppingCart_num;
    }

    public Commodity() {
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", repertor=" + repertor +
                ", productDescribe='" + productDescribe + '\'' +
                '}';
    }
}
