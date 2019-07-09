package com.cheer.springbootdemo.service.impl;

import com.cheer.springbootdemo.dao.ExamMapper;
import com.cheer.springbootdemo.model.Exam;
import com.cheer.springbootdemo.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //声明事务，将该类所有共有方法都设置为事务方法
@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    private ExamMapper examMapper;
    @Override
    public int insert(Exam exam) throws Exception {
        int i = this.examMapper.insert(exam);
        if(i != 1){
            throw new Exception("插入失败");
        }
        return i;
    }

    @Override
    public List<Exam> getExam() {
        return this.examMapper.getExam();
    }

    @Override
    public List<Exam> getanswer(int id) {
        return this.examMapper.getanswer(id);
    }

    @Override
    public List<String> getkey() {
        return this.examMapper.getkey();
    }
}
