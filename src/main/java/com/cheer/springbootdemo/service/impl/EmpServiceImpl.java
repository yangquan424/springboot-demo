package com.cheer.springbootdemo.service.impl;


import com.cheer.springbootdemo.dao.EmpMapper;
import com.cheer.springbootdemo.model.Emp;
import com.cheer.springbootdemo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //声明事务，将该类所有共有方法都设置为事务方法
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper; // 该错误提示可以忽略，是ide误报的，原因是找不到EmpMapper的实现类在spring容器里

    @Override
    public List<Emp> getList() {
        return this.empMapper.getEmpAll();
    }

    @Override
    public int doDelete(Integer empno) {
        int num = this.empMapper.doDelete(empno);
        return num;
    }

    @Override
    public int insert(Emp emp) throws Exception {
        int num = this.empMapper.insert(emp);
        if(num != 1){
            throw new Exception("插入失败");
        }
        return num;
    }

    @Override
    public int update(Emp emp) throws Exception {
        int num = this.empMapper.doUpdate(emp);
        if (num != 1 ){
            throw new Exception("更新失败");
        }
        return num;
    }

    @Override
    public Emp getEmp(Integer empno) {
        return this.empMapper.getEmp(empno);
    }
}