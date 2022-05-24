package com.xf.demo.bean;

public class Site {
    private String userName;//用户
    private String province;//省份
    private String city;//市
    private String county;//区
    private String name;//收件人
    private String postalCode;//邮政编码
    private String tel;//电话
    private String addressDetail;//详细地址
    private String defaultDetail;//是否设置成默认地址
    private int id;
    public Site(String userName, String province, String city, String county, String name, String postalCode, String tel, String addressDetail, String defaultDetail,int id) {
        this.userName = userName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.name = name;
        this.postalCode = postalCode;
        this.tel = tel;
        this.addressDetail = addressDetail;
        this.defaultDetail = defaultDetail;
        this.id=id;
    }

    public Site() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getDefaultDetail() {
        return defaultDetail;
    }

    public void setDefaultDetail(String defaultDetail) {
        this.defaultDetail = defaultDetail;
    }

    public Site(String userName, String province, String city, String county, String name, String postalCode, String tel, String addressDetail, String defaultDetail) {
        this.userName = userName;
        this.province = province;
        this.city = city;
        this.county = county;
        this.name = name;
        this.postalCode = postalCode;
        this.tel = tel;
        this.addressDetail = addressDetail;
        this.defaultDetail = defaultDetail;
    }

    public Site(String province, String city, String county, String name, String postalCode, String tel, String addressDetail, String defaultDetail, int id) {
        this.province = province;
        this.city = city;
        this.county = county;
        this.name = name;
        this.postalCode = postalCode;
        this.tel = tel;
        this.addressDetail = addressDetail;
        this.defaultDetail = defaultDetail;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
