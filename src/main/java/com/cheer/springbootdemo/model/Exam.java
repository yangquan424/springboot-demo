package com.cheer.springbootdemo.model;



import lombok.Data;

import java.io.Serializable;

@Data
public class Exam implements Serializable {
    private int id;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String answer;
}
