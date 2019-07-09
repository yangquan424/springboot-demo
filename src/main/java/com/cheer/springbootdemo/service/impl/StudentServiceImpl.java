package com.cheer.springbootdemo.service.impl;

import com.cheer.springbootdemo.dao.StudentMapper;
import com.cheer.springbootdemo.model.Student;
import com.cheer.springbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //声明事务，将该类所有共有方法都设置为事务方法
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getUser(String username) {
        return this.studentMapper.getUser(username);
    }

    @Override
    public int register(Student student) {
        return this.studentMapper.register(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }
}
