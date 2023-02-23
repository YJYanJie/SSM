package com.yj.spring.test;

import com.yj.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/31 18:18
 * @Version 1.0
 */
public class LifeCycleTest {

   /**
    * bean的生命周期
    * 1. 实例化
    * 2. 依赖注入
    * 3. 后置处理器的postProcessBeforeInitialization
    * 4. 初始化，需要通过bean的init-method属性指定初始化的方法
    * 5. 后置处理器的postProcessAfterInitialization
    * 6. bean的使用
    * 7. IOC容器关闭后销毁，需要通过bean的destroy-method属性指定销毁的方法
    *
    * 注意：
    * 如果bean的作用域是singleton，bean的生命周期的前三个步骤会在获取IOC容器时执行
    * 如果bean的作用域是prototype，bean的生命周期的前三个步骤会在获取bean时执行
    */
   @Test
   public void testLifeCycle(){
      //ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法
      ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
      User user = ioc.getBean(User.class);
      System.out.println("生命周期：4、通过IOC容器获取bean并使用");
      ioc.close();
   }
}
