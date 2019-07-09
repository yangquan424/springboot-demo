package com.cheer.springbootdemo.dao;


import com.cheer.springbootdemo.model.Users;

public interface UsersMapper {

    int register(Users users);

    Users getList(String username);

}
