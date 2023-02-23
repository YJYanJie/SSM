package com.yj.mybatis.test;

import com.yj.mybatis.mapper.UserMapper;
import com.yj.mybatis.pojo.User;
import com.yj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * ClassName: MyBatisTest
 * Package: com.yj.mybatis.test
 * Description:
 *
 * @Author YJ
 * @Create 2022/12/30 17:16
 * @Version 1.0
 */
public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取 SqlSessionFactoryBuilder 对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取Sql的会话对象SqlSession，是MyBatis提供的操作数据库的对象，此时的SqlSession对象所操作的sql语句都必须手动的提交或者回滚事务
//        SqlSession sqlSession = sqlSessionFactory.openSession(); //默认是回滚的，需要手动的提交事务
        ///创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class); //获取了接口的代理实现类对象，实现了接口中的方法
        //调用mapper接口中的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        //通过提供的sql唯一标识找到sql，并执行，唯一标识是：namespace.sqlId
//        int result = sqlSession.insert("com.yj.mybatis.mapper.UserMapper.insertUser");
        System.out.println("结果为：" + result);
        //提交事务
//        sqlSession.commit();
        //关闭SqlSession对象
        sqlSession.close();
    }

    @Test
    public void testUpdate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testDelete(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetAllUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
        sqlSession.close();
    }
}
