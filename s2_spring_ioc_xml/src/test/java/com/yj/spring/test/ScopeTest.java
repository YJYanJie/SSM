package com.yj.spring.test;

import com.yj.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/31 18:05
 * @Version 1.0
 */
public class ScopeTest {

   @Test
   public void testScope(){
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-scope.xml");
      Student student1 = ioc.getBean(Student.class);
      Student student2 = ioc.getBean(Student.class);
      System.out.println(student1 == student2);
//      System.out.println(student2);
   }
}
