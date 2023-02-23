package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * ClassName: UserMapper
 * Package: com.yj.mybatis.mapper
 * Description: MyBatis 获取参数值的两种方式：${} 和 #{}
 * ${} 的本质是字符串拼接         #{} 的本质是占位符赋值
 * 1、若 mapper 接口方法的参数为单个的字面量类型时，此时可以通过 ${} 和 #{} 以任意的内容获取数值，一定要注意 ${} 需要手动添加单引号
 * 2、若 mapper 接口方法的参数为多个的字面量类型时，此时MyBatis会将参数放在map集合中，以两种方式存储数据
 *      a. 以 arg0,arg1...为键，以参数为值
 *      b. 以 param1,param2...为键，以参数为值
 *    因此，只需要通过${} 和 #{}访问map的键，就可以获取相对应的值，一定要注意${}的单引号问题
 * 3、若 mapper 接口方法的参数为map类型类型时，只需要通过 ${} 和 #{}访问map集合的键，就可以获取相对应的值，一定要注意${}的单引号问题
 * 4、若 mapper 接口方法的参数为实体类类型时，只需要通过 ${} 和 #{}访问实体类中的属性名（只与实体类的get、set方法有关），
 *    就可以获取相对应的值，一定要注意${}的单引号问题
 * 5、可以在mapper接口方法的参数上设置@Param注解，此时MyBatis会将这些参数放在map中，以两种方式进行存储
 *      a. 以@Param注解的value属性值为键，以参数为值
 *      b. 以 param1,param2...为键，以参数为值
 * @Author YJ
 * @Create 2022/12/30 22:29
 * @Version 1.0
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录（以map集合作为参数）
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录（使用@Param注解）
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

}
