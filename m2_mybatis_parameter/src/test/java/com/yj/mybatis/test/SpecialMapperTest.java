package com.yj.mybatis.test;

import com.yj.mybatis.mapper.SpecialSQLMapper;
import com.yj.mybatis.pojo.User;
import com.yj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

/**
 * ClassName: SpecialMapperTest
 * Package: com.yj.mybatis.test
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/3 20:16
 * @Version 1.0
 */
public class SpecialMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        System.out.println(list);
    }


    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        String ids = "5, 6, 7, 8, 9, 10";
        mapper.deleteMore(ids);
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        System.out.println(list);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "xiaoming", "1234561", 23, "男", "123@QQ.COM");
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void testJDBC(){
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("","","");
//            String sql = "select * from t_user where username like '%?%'";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, "a");
            String sql = "insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();//获取自增的主键
            resultSet.next();
            int id = resultSet.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
