package com.cheer.springbootdemo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Users implements Serializable {
    private int id;
    private String username;
    private String password;
}
