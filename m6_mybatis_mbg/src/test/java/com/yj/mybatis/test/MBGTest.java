package com.yj.mybatis.test;

import com.yj.mybatis.mapper.EmpMapper;
import com.yj.mybatis.pojo.Emp;
import com.yj.mybatis.pojo.EmpExample;
import com.yj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: MBGTest
 * Package: com.yj.mybatis.test
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 17:20
 * @Version 1.0
 */
public class MBGTest {

    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
        //查询所有数据
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);

        //根据条件查询数据
        EmpExample example = new EmpExample();
        example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(20);
        example.or().andGenderEqualTo("男");
        List<Emp> list = mapper.selectByExample(example);
        list.forEach(System.out::println);

        //测试普通修改功能
//        Emp emp = new Emp(1, "小黑子", null, "女");
//        mapper.updateByPrimaryKey(emp);

        //选择性修改功能
//        Emp emp = new Emp(1, "小黑子", null, "女");
//        mapper.updateByPrimaryKeySelective(emp);
    }
}
