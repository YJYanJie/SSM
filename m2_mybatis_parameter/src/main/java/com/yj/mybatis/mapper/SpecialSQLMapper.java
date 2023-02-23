package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: SpecialSQLMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/3 20:13
 * @Version 1.0
 */
public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteMore(@Param("ids") String ids);

    /**
     * 动态设置表名，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息，并获取自增的逐渐
     * @param user
     */
    void insertUser(User user);
}
