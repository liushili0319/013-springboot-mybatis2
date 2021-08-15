package com.csiic.springboot.controller;

import com.csiic.springboot.model.User;
import com.csiic.springboot.service.UserService;
import com.csiic.springboot.service.impl.LogsStatServiceImpl;
import com.csiic.springboot.utils.JwtUtils;
import com.csiic.springboot.vo.CodeMsg;
import com.sun.org.apache.bcel.internal.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/registered")
    //注册用户
    public CodeMsg insertUser(User user){
        String username = user.getUsername();
        int code=userService.selectName(username);
        if (code==0){
            userService.insert(user);
            System.out.println("注册成功");
            System.out.println(user);
        }else {
            return new CodeMsg(-1,"注册失败");
        }
        return new CodeMsg(1,"注册成功");
    }

    //登录账号
    @PostMapping("/user/login")
    public Map<String,Object> userLogin(User user){
        int code=userService.findUser(user);
        System.out.println(user);
        System.out.println(code==1?"登录成功":"登录失败");
        Map<String,Object> map=new HashMap<>();
        if (code==0){
            map.put("code",-1);
            map.put("msg","登录失败");
            return map;
        }
        Map<String,String> payload=new HashMap<>();
        payload.put("username",user.getUsername());
        //生成JWT令牌
        String token = JwtUtils.getToken(payload);
        map.put("code",1);
        map.put("msg","登录成功");
        map.put("token",token);
        return map;
    }

}
