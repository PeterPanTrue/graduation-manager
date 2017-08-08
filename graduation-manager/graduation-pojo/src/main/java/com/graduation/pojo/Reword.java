package com.graduation.pojo;

import java.util.Date;

public class Reword {
    private Integer rewordid;

    private String rewordname;

    private String money;

    private String description;

    private Date createtime;

    private String createperson;

    private String temp1;

    private String tepm2;

    private String temp3;

    public Integer getRewordid() {
        return rewordid;
    }

    public void setRewordid(Integer rewordid) {
        this.rewordid = rewordid;
    }

    public String getRewordname() {
        return rewordname;
    }

    public void setRewordname(String rewordname) {
        this.rewordname = rewordname == null ? null : rewordname.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateperson() {
        return createperson;
    }

    public void setCreateperson(String createperson) {
        this.createperson = createperson == null ? null : createperson.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTepm2() {
        return tepm2;
    }

    public void setTepm2(String tepm2) {
        this.tepm2 = tepm2 == null ? null : tepm2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
}