package com.csiic.springboot.service;

import com.csiic.springboot.mapper.UserMapper;
import com.csiic.springboot.mapper.logsStatMapper;
import com.csiic.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

    public int selectName(String username) {
        int code=userMapper.selectName(username);
        return code;
    }

    public int findUser(User user) {
        int code=userMapper.findUser(user);
        return code;
    }
}
