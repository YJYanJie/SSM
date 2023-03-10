package com.yj.mybatis.test;

import com.yj.mybatis.mapper.SelectMapper;
import com.yj.mybatis.pojo.User;
import com.yj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * ClassName: SelectMapperTest
 * Package: com.yj.mybatis.test
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/3 15:34
 * @Version 1.0
 */
public class SelectMapperTest {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }

    @Test
    public void testGetCount(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
    }

    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> user = mapper.getUserByIdToMap(1); // {password=123456, gender=男, id=1, age=23, email=123456@qq.com, username=admin}
//        Map<String, Object> user = mapper.getUserByIdToMap(4); // {password=1234, id=4, username=lisi}
        System.out.println(user);
    }

    @Test
    public void testGetAllUserToMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
//        List<Map<String, Object>> list = mapper.getAllUserToMap();
//        System.out.println(list);
        Map<String, Object> map = mapper.getAllUserToMap();
        System.out.println(map);
    }
}
