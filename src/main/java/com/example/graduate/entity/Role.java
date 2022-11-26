package com.example.graduate.entity;

public class Role {
    private Integer id;

    private String rolename;

    private String rolenum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolenum() {
        return rolenum;
    }

    public void setRolenum(String rolenum) {
        this.rolenum = rolenum == null ? null : rolenum.trim();
    }
}