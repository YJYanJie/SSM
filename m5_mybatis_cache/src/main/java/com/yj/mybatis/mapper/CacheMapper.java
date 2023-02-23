package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: CacheMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 16:26
 * @Version 1.0
 */
public interface CacheMapper {

    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);

    /**
     * 添加员工信息
     * @param emp
     */
    void insertEmp(Emp emp);
}
