package com.xf.demo.bean;
import java.util.Date;
public class User {
   private String user_name;
   private String user_pwd;
   private String user_img;
   private String user_tel;
   private int user_age;
   private String user_sex;
   private double user_balance;
   private int user_discounts;
   private int user_buynum;
   private int user_integral;
   private double total_assets;
   private int unused_topup;
   private double unused_consum;

    public User(String user_name, String user_pwd, String user_img, String user_tel, int user_age, String user_sex, double user_balance, int user_discounts, int user_buynum, int user_integral) {
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_img = user_img;
        this.user_tel = user_tel;
        this.user_age = user_age;
        this.user_sex = user_sex;
        this.user_balance = user_balance;
        this.user_discounts = user_discounts;
        this.user_buynum = user_buynum;
        this.user_integral = user_integral;
    }

    public User(String user_name, String user_pwd, String user_img, String user_tel, int user_age, String user_sex, double user_balance, int user_discounts, int user_buynum, int user_integral, double total_assets, int unused_topup, double unused_consum) {
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_img = user_img;
        this.user_tel = user_tel;
        this.user_age = user_age;
        this.user_sex = user_sex;
        this.user_balance = user_balance;
        this.user_discounts = user_discounts;
        this.user_buynum = user_buynum;
        this.user_integral = user_integral;
        this.total_assets = total_assets;
        this.unused_topup = unused_topup;
        this.unused_consum = unused_consum;
    }

    public double getTotal_assets() {
        return total_assets;
    }

    public void setTotal_assets(double total_assets) {
        this.total_assets = total_assets;
    }

    public int getUnused_topup() {
        return unused_topup;
    }

    public void setUnused_topup(int unused_topup) {
        this.unused_topup = unused_topup;
    }

    public double getUnused_consum() {
        return unused_consum;
    }

    public void setUnused_consum(double unused_consum) {
        this.unused_consum = unused_consum;
    }

    public double getUser_balance() {
        return user_balance;
    }

    public void setUser_balance(double user_balance) {
        this.user_balance = user_balance;
    }

    public int getUser_discounts() {
        return user_discounts;
    }

    public void setUser_discounts(int user_discounts) {
        this.user_discounts = user_discounts;
    }

    public int getUser_buynum() {
        return user_buynum;
    }

    public void setUser_buynum(int user_buynum) {
        this.user_buynum = user_buynum;
    }

    public int getUser_integral() {
        return user_integral;
    }

    public void setUser_integral(int user_integral) {
        this.user_integral = user_integral;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_img() {
        return user_img;
    }

    public void setUser_img(String user_img) {
        this.user_img = user_img;
    }

    public String getTel() {
        return user_tel;
    }

    public void setTel(String user_tel) {
        this.user_tel = user_tel;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public User() {
    }

    public User(String user_name, String user_pwd, String tel, int user_age, String user_sex) {
        this.user_name = user_name;
        this.user_pwd = user_pwd;
        this.user_tel = user_tel;
        this.user_age = user_age;
        this.user_sex = user_sex;
    }
}
