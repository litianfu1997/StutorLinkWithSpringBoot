package com.nnxy.service.impl;

import com.nnxy.dao.UserMapper;
import com.nnxy.entity.User;
import com.nnxy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-11 15:16
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 用户注册逻辑,成功返回true,失败返回false
     * @param user
     * @return
     */
    @Override
    public Boolean userRegister(User user){
        System.out.println("已进入service。。。");

        //查询用户是否存在
        User isExist = userMapper.selectUserByUserCode(user.getUserCode());

        //如果用户已存在
        if(isExist != null){
            System.out.println("用户已存在");
            return false;
        }else {
            //如果用户不存在,则注册用户
            System.out.println("正在插入。。");
            userMapper.insertUser(user);
            System.out.println("插入成功");
            return true;
        }

    }

    /**
     * 用户登陆逻辑实现 返回0代表登陆成功 1代表密码错误 -1代表用户不存在
     * @param user
     * @return
     */
    @Override
    public User selectUserByUserCode(User user) {

        //查询用户
        User u = userMapper.selectUserByUserCode(user.getUserCode());
        return u;
    }

    /**
     * 检查用户所填的密码是否是注册时填的密码
     * @param user
     * @return
     */
    @Override
    public Integer checkUserPhone(User user) {
        User u = userMapper.selectUserByUserCode(user.getUserCode());

        if (u == null){
            //如果用户不存在,返回-1
            return -1;
        }
        else if(!u.getUserPhone().equals(user.getUserPhone())){
            //如果电话号码不匹配,返回1
            return 1;
        }
        else{
            return 0;
        }
    }

    @Override
    public Integer updateUserPasswordByUserCode(User user) {
        //查询用户
        User u = userMapper.selectUserByUserCode(user.getUserCode());
        //设置密码
        u.setPassword(user.getPassword());
        //修改密码
        Integer integer = userMapper.updateUser(u);
        return integer;
    }



}
