package com.example.ssm.service.impl;

import com.example.ssm.mapper.UserMapper;
import com.example.ssm.model.User;
import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {

    }


}
