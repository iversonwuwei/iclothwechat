package com.walden.service.impl;

import com.walden.mapper.UserMapper;
import com.walden.model.User;
import com.walden.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by walden on 2016/12/22.
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getall() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }


}
