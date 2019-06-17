package com.nnxy.service;

import com.nnxy.entity.User;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-10 17:33
 */
public interface IUserService {

    /**
     * 用户注册逻辑,成功返回true,失败返回false
     * @param user
     * @return
     */
    public Boolean userRegister(User user);

    /**
     * 用户登陆业务逻辑
     * @param user
     * @return
     */
    public User selectUserByUserCode(User user);

    /**
     * 检查用户所填的密码是否是注册时填的密码
     * @param user
     * @return
     */
    public Integer checkUserPhone(User user);

    /**
     * 通过用户码修改密码
     * @param user
     * @return
     */
    Integer updateUserPasswordByUserCode(User user);
}
