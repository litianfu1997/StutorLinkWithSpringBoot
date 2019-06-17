package com.nnxy.conctroller;

import com.nnxy.conctroller.utils.Massage;
import com.nnxy.entity.User;
import com.nnxy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author litianfu
 * @version 1.0
 * @email 1035869369@qq.com
 * @date 2019-06-11 15:15
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;



    @RequestMapping(value = "/register.action" )
    public @ResponseBody Massage userRegister(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
        System.out.println("你们好");
        //成功返回true,失败返回false
        Boolean flag = userService.userRegister(user);

        if(flag){
            return new Massage("success","注册成功");
        }
        else {
            return new Massage("error","用户已存在");
        }


    }


    @RequestMapping("/login.action")
    public @ResponseBody
    Massage userLogin(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
        Massage massage = new Massage();
        User u =  userService.selectUserByUserCode(user);
        if(u == null){
            massage.setStatus("error");
            massage.setMsg("用户不存在");
        }
        else if(!u.getPassword().equals(user.getPassword())){
            massage.setStatus("error");
            massage.setMsg("密码错误");
        }
        else {
            massage.setStatus("success");
            massage.setMsg("登陆成功");
            massage.setObj(u);
        }
        return massage;
    }

    @RequestMapping("/checkUserPhone.action")
    public @ResponseBody
    Massage checkUserPhone(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
        //检查输入的电话号码是否是注册时所填的电话号码
        Integer flag = userService.checkUserPhone(user);
        if(flag == 0){
            return new Massage("success","用户电话号码正确");
        }
        else if(flag == -1){
            return new Massage("error","用户不存在");
        }
        else if(flag == 1){
            return new Massage("error","用户输入的电话号码不正确");
        }
        else {
            return new Massage("error","未知错误");
        }
    }

    @RequestMapping("/updatePassword.action")
    public @ResponseBody
    Massage updateUserPassword(@RequestBody User user, HttpServletRequest request, HttpServletResponse response){
        //调用修改密码的函数
        Integer integer = userService.updateUserPasswordByUserCode(user);

        if (integer >= 1){
            return new Massage("success","修改成功");
        }
        else{
            return new Massage("error","修改失败");
        }
    }

}
