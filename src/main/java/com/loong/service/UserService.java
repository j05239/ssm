package com.loong.service;

import com.loong.pojo.User;

/**
 * Created by yvanme on 2017/2/26.
 */
public interface UserService {
    User info(String id)throws Exception;
}
