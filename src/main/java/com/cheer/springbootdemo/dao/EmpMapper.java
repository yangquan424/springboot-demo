package com.cheer.springbootdemo.dao;


import com.cheer.springbootdemo.model.Emp;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询一条数据
     * @param empno 被查询的主键
     * @return 返回被查询的数据
     */
    Emp getEmp(Integer empno);

    /**
     * 插入一条数据
     * @param emp 被插入的数据
     * @return 返回被影响的行数
     */
    int insert(Emp emp);

    /**
     * 查询整个表的数据
     * @return 返回整个表的数据
     */
    List<Emp> getEmpAll();

    /**
     * 删除一条数据
     * @param  empno 被删除的数据主键
     * @return 返回被影响的行数
     */
    int doDelete(Integer empno);

    /**
     * 修改一条数据
     * @param emp 被修改的数据主键
     * @return 返回被影响的行数
     */
    int doUpdate(Emp emp);

    /**
     * 分页查询测试
     * @return 返回被查询对象
     */
    List<Emp> PagehelpTest();

    List<Emp> getjson();

}
