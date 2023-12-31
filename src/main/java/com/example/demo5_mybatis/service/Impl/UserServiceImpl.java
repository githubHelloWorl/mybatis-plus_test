package com.example.demo5_mybatis.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo5_mybatis.entity.User;
import com.example.demo5_mybatis.mapper.UserMapper;
import com.example.demo5_mybatis.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
