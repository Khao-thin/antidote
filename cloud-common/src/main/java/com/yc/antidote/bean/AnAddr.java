package com.yc.antidote.bean;

public class AnAddr {
    private Integer id;

    private Integer uid;

    private String name;

    private String addr;

    private String phone;

    private Integer dft;

    private Integer sheng;

    private Integer shi;

    private Integer xian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getDft() {
        return dft;
    }

    public void setDft(Integer dft) {
        this.dft = dft;
    }

    public Integer getSheng() {
        return sheng;
    }

    public void setSheng(Integer sheng) {
        this.sheng = sheng;
    }

    public Integer getShi() {
        return shi;
    }

    public void setShi(Integer shi) {
        this.shi = shi;
    }

    public Integer getXian() {
        return xian;
    }

    public void setXian(Integer xian) {
        this.xian = xian;
    }
}