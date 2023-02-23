package com.yj.mybatis.mapper;

import com.yj.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ClassName: SelectMapper
 * Package: com.yj.mybatis.mapper
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/3 15:33
 * @Version 1.0
 */
public interface SelectMapper {

    /**
     * 若 sql 语句查询的结果为多条时，一定不能以实体类类型作为方法的返回值， sqlSession.selectOne()
     * 否则会抛出异常TooManyResultsException
     * 若 sql 语句查询的结果为一条时，此时可以使用实体类类型或list集合类型作为方法的返回值
     */


    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为map集合
     * @return
     * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，此
     * 时可以将这些map放在一个list集合中获取
     */
//    List<Map<String, Object>> getAllUserToMap(); //使用的多

    /**
     * 查询所有用户信息为map集合
     *
     * @return
     * 将表中的数据以map集合的方式查询，一条数据对应一个map；若有多条数据，就会产生多个map集合，并
     * 且最终要以一个map的方式返回数据，此时需要通过@MapKey注解设置map集合的键，值是每条数据所对应的
     * map集合
     */
    @MapKey("id") // 将什么作为map集合的key
    Map<String, Object> getAllUserToMap();
}
