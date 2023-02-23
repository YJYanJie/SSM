package com.yj.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yj.mybatis.mapper.EmpMapper;
import com.yj.mybatis.pojo.Emp;
import com.yj.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * ClassName: PageTest
 * Package: com.yj.mybatis.test
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/5 17:48
 * @Version 1.0
 */
public class PageTest {

    /**
     * PageInfo{
     * pageNum=2, pageSize=4, size=4,
     * startRow=5, endRow=8, total=34,
     * pages=9,
     * list=Page{count=true, pageNum=2, pageSize=4, startRow=4, endRow=8, total=34, pages=9, reasonable=false, pageSizeZero=false}[Emp{empId=5, empName='a', age=null, gender='null', deptId=null}, Emp{empId=6, empName='a', age=null, gender='null', deptId=null}, Emp{empId=7, empName='a', age=null, gender='null', deptId=null}, Emp{empId=8, empName='a', age=null, gender='null', deptId=null}],
     * prePage=1, nextPage=3, isFirstPage=false,
     * isLastPage=false, hasPreviousPage=true,
     * hasNextPage=true, navigatePages=5,
     * navigateFirstPage=1, navigateLastPage=5, navigatepageNums=[1, 2, 3, 4, 5]}
     */
    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //分页查询
        // 1. 查询功能之前开启分页功能
        Page<Object> page = PageHelper.startPage(2, 4);
        List<Emp> list = mapper.selectByExample(null);

        // 2. 查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list, 5);
        list.forEach(System.out::println);
        System.out.println(page);
        System.out.println(pageInfo);
    }

//    PageInfo{
//    pageNum=2, pageSize=4, size=4,
//    startRow=5, endRow=8, total=34,
//    pages=9,
//    list=Page{count=true, pageNum=2, pageSize=4, startRow=4, endRow=8, total=34, pages=9, reasonable=false, pageSizeZero=false}[Emp{empId=5, empName='a', age=null, gender='null', deptId=null}, Emp{empId=6, empName='a', age=null, gender='null', deptId=null}, Emp{empId=7, empName='a', age=null, gender='null', deptId=null}, Emp{empId=8, empName='a', age=null, gender='null', deptId=null}],
//     prePage=1, nextPage=3, isFirstPage=false,
//     isLastPage=false, hasPreviousPage=true,
//     hasNextPage=true, navigatePages=5,
//     navigateFirstPage=1, navigateLastPage=5, navigatepageNums=[1, 2, 3, 4, 5]}
}
