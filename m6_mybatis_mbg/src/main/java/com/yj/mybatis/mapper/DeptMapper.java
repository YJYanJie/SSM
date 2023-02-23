package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.Dept;
import com.yj.mybatis.pojo.DeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dept
     *
     * @mbggenerated Mon Jan 30 21:06:00 CST 2023
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);
}