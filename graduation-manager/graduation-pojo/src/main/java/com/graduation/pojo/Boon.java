package com.graduation.pojo;

public class Boon {
    private Integer boonid;

    private String boonname;

    private String boonmoney;

    private String description;

    private String temp1;

    private String temp2;

    private String temp3;

    public Integer getBoonid() {
        return boonid;
    }

    public void setBoonid(Integer boonid) {
        this.boonid = boonid;
    }

    public String getBoonname() {
        return boonname;
    }

    public void setBoonname(String boonname) {
        this.boonname = boonname == null ? null : boonname.trim();
    }

    public String getBoonmoney() {
        return boonmoney;
    }

    public void setBoonmoney(String boonmoney) {
        this.boonmoney = boonmoney == null ? null : boonmoney.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }
}