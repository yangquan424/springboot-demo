package com.cheer.springbootdemo.dao;



import com.cheer.springbootdemo.model.Exam;

import java.util.List;

public interface ExamMapper {
    List<Exam> getExam();

    int insert(Exam exam);

    List<Exam> getanswer(int id);

    List<String> getkey();
}
