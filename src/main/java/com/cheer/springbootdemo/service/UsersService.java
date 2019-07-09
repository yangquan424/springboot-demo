package com.cheer.springbootdemo.service;


import com.cheer.springbootdemo.model.Users;

public interface UsersService {

    int register(Users users) throws Exception;

    Users getList(String username);

}
