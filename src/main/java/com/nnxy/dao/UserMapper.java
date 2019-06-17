package com.nnxy.dao;

import com.nnxy.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-11 15:09
 */
@Mapper
public interface UserMapper {

    /**
     * 插入用户
     *  @param user
     * @return
     */
    public Integer insertUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    public Integer deleteUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public Integer updateUser(User user);

    /**
     * t通过id查询用户
     * @param userId
     * @return
     */
    public User selectUserById(Integer userId);

    /**
     * 通过用户名查找用户
     * @param userCode
     * @return
     */
    public User selectUserByUserCode(String userCode);
}
