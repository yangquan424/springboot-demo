package com.cheer.springbootdemo.model;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
@Data
public class Emp implements Serializable {
    @NotNull
    @Digits(integer = 6, fraction = 0)
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private String hiredate;
    private Double sal;
    private Double com;
    private Integer deptno;

}
