package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.User;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2022/12/30 17:03
 * @Version 1.0
 */
public interface UserMapper {

    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户信息
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();
}

