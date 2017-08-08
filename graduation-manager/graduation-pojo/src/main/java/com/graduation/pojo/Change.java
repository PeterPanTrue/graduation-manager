package com.graduation.pojo;

import java.util.Date;

public class Change {
    private Integer changeid;

    private Integer memberid;

    private String name;

    private String olddept;

    private String newdept;

    private String oldposition;

    private String newposition;

    private Date time;

    private String reason;

    private Integer isdeleted;

    private Date createtime;

    private String createperson;

    private String temp1;

    private String temp2;

    private String temp3;

    public Integer getChangeid() {
        return changeid;
    }

    public void setChangeid(Integer changeid) {
        this.changeid = changeid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOlddept() {
        return olddept;
    }

    public void setOlddept(String olddept) {
        this.olddept = olddept == null ? null : olddept.trim();
    }

    public String getNewdept() {
        return newdept;
    }

    public void setNewdept(String newdept) {
        this.newdept = newdept == null ? null : newdept.trim();
    }

    public String getOldposition() {
        return oldposition;
    }

    public void setOldposition(String oldposition) {
        this.oldposition = oldposition == null ? null : oldposition.trim();
    }

    public String getNewposition() {
        return newposition;
    }

    public void setNewposition(String newposition) {
        this.newposition = newposition == null ? null : newposition.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
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