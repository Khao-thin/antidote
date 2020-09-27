package com.yc.cloudcommon.bean;

public class AnLog {
    private Integer id;

    private String com;

    private String lids;

    private String name;

    private String phone;

    private String addr;

    private Integer oid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com == null ? null : com.trim();
    }

    public String getLids() {
        return lids;
    }

    public void setLids(String lids) {
        this.lids = lids == null ? null : lids.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}