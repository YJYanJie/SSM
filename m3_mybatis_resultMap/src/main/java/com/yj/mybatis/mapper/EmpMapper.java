package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: EmpMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 12:56
 * @Version 1.0
 */
public interface EmpMapper {

    /**
     * 根据id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 查询员工以及其对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 分步查询：查询员工以及其对应的部门信息-One
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    /**
     * 分步查询：查询部门以及部门对应的所有员工信息-Two
     * @param deptId
     * @return
     */
    List<Emp> getDeptAndEmpByStepTow(@Param("dempId") Integer deptId);
}
