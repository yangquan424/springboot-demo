package com.cheer.springbootdemo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private int id;
    private String username;
    private String Password;
    private int correct;
    private int error;
    private int miss;
    private int scores;
    private String pass;

}
