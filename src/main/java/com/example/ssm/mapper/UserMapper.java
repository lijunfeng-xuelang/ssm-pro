package com.example.ssm.mapper;

import com.example.ssm.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    void addUser(User user);
}
