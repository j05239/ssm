package com.loong.service.impl;

import com.loong.mapper.UserMapper;
import com.loong.pojo.User;
import com.loong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yvanme on 2017/2/26.
 */

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;
    public User info(String id) throws Exception {
        return mapper.selectByPrimaryKey(id);
    }
}
