package com.cheer.springbootdemo.service;


import com.cheer.springbootdemo.model.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getList();

    int doDelete(Integer empno);

    int insert(Emp emp) throws Exception;

    int update(Emp emp) throws Exception;

    Emp getEmp(Integer empno);
}
