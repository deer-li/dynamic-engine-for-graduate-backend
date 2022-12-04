package com.hfuu.graduate.entity;

import java.util.Date;

public class ComponentByType {
    private Integer cid;

    private String cname;

    private Date createTime;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ComponentByType{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}