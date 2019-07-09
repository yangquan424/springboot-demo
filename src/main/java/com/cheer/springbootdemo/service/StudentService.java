package com.cheer.springbootdemo.service;


import com.cheer.springbootdemo.model.Student;

public interface StudentService {
    /**
     * 用于校验登录用户和查询学员考试信息
     * @param username
     * @return
     */
    Student getUser(String username);

    /**
     * 用于注册用户
     * @param student
     * @return
     */
    int register(Student student);

    /**
     * 用于登记学员考试结果
     * @param student
     * @return
     */
    int update(Student student);
}
