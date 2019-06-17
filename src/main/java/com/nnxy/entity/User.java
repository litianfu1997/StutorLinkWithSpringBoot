package com.nnxy.entity;

import java.io.Serializable;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-10 17:33
 */
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户码
     */
    private String userCode;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户生日
     */
    private String birthday;
    /**
     * 用户职业
     */
    private String professional;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 用户手机号码
     */
    private String userPhone;
    /**
     * 该用户是否被封禁标志位
     */
    private boolean isNotBlocked;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", professional='" + professional + '\'' +
                ", sex='" + sex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", isNotBlocked=" + isNotBlocked +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public boolean isNotBlocked() {
        return isNotBlocked;
    }

    public void setNotBlocked(boolean notBlocked) {
        isNotBlocked = notBlocked;
    }




}
