package com.nnxy.conctroller.utils;

/**
 * 装有操作的结果
 * @author JGZ
 * @Classname Massage
 * @Date 2019/4/27 20:20
 * @Email 1945282561@qq.com
 */
public class Massage {
    private String status;
    private String msg;
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Massage(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Massage() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
