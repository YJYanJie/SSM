package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: DeptMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 13:45
 * @Version 1.0
 */
public interface DeptMapper {

    /**
     * 分步查询：查询员工以及其对应的部门信息-Two
     * @return
     */
    Dept getEmpAndDeptByStepTow(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中的员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 分步查询：查询部门以及部门中的员工信息-One
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
