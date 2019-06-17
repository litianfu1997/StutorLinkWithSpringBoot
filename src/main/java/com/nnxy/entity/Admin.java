package com.nnxy.entity;

import java.io.Serializable;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-10 18:01
 */
public class Admin implements Serializable {
    /**
     * 管理员id
     */
    private Integer adminId;
    /**
     * 管理员码
     */
    private String adminCode;
    /**
     * 管理员昵称
     */
    private String adminName;
    /**
     * 管理员密码
     */
    private String password;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminCode='" + adminCode + '\'' +
                ", adminName='" + adminName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
