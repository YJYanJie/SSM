package com.yj.spring.test;

import com.yj.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/30 22:25
 * @Version 1.0
 */
public class HelloWorldTest {

   @Test
   public void test(){
      //获取IOC容器
      ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
      //获取IOC容器中的bean对象
      HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
      helloWorld.sayHello();
   }
}
