package com.yj.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/31 17:17
 * @Version 1.0
 */
public class DataSourceTest {

   @Test
   public void testDataSource() throws SQLException {
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-datasource.xml");
      DruidDataSource dataSource = ioc.getBean(DruidDataSource.class);
      System.out.println(dataSource.getConnection());
   }
}
