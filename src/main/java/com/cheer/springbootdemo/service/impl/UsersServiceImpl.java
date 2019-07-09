package com.cheer.springbootdemo.service.impl;

import com.cheer.springbootdemo.dao.UsersMapper;
import com.cheer.springbootdemo.model.Users;
import com.cheer.springbootdemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public int register(Users users) throws Exception {
        int i = this.usersMapper.register(users);
        if(i != 1){
            throw new Exception("插入失败");
        }
        return i;
    }

    @Override
    public Users getList(String username) {
        return this.usersMapper.getList(username);
    }
}
