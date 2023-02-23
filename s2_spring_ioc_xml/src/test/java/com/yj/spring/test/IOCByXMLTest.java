package com.yj.spring.test;


import com.yj.spring.pojo.Person;
import com.yj.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @Author YJ
 * @Create 2023/1/30 22:33
 * @Version 1.0
 */
public class IOCByXMLTest {

   /**
    * 获取bean的三种方式：
    *    1. 根据bean的id获取
    *    2. 根据bean的类型获取 -> 要求IOC容器中，有且只有一个类型匹配的bean
    *    注意：若没有任何一个类型匹配的bean，此时抛出异常：NoSuchBeanDefinitionException
    *         若有一个类型匹配的多个bean，此时抛出异常：NoUniqueBeanDefinitionException
    *    3. 根据bean的id和类型获取 (如果IOC中有一个类型匹配的多个bean时)
    *
    *    根据类型来获取bean时，在满足bean唯一性的前提下，其实只是看：『对象 instanceof 指定的类型』的返回结果，
    *    只要返回的是true就可以认定为和类型匹配，能够获取到。
    *    即通过bean的类型、bean所继承的类的类型（其父类）、bean所实现的接口的类型都可以获取bean
    */
   @Test
   public void testIOC(){
      //获取IOC容器
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");

      //获取IOC容器中的bean对象: 反射(使用的是无参构造) + 工厂模式
      //方式一：id
//      Student studentOne = (Student) ioc.getBean("studentOne");
      //方式二：类型
//      Student student = ioc.getBean(Student.class);
      //方式三：id + 类型
//      Student student = ioc.getBean("studentOne", Student.class);
      Person person = ioc.getBean(Person.class); //如果组件类实现了接口，根据接口类型可以获取 bean?    可以，前提bean是唯一的
      // 如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？     不行，因为bean不唯一
      System.out.println(person);
   }

   /**
    * 测试依赖注入DI
    */
   @Test
   public void testDI(){
      //获取IOC容器
      ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
      //获取bean
      Student student = ioc.getBean("studentTwo", Student.class); //set方法注入
//      student = ioc.getBean("studentThree", Student.class); //构造器注入
//      student = ioc.getBean("studentFour", Student.class); //特殊值注入
//      student = ioc.getBean("studentFive", Student.class); //为类类型属性赋值：外部bean、内部bean(IOC容器无法直接获取)、级联
//      student = ioc.getBean("studentSix", Student.class); //为数组类型属性赋值：array标签 + value/ref标签
//      student = ioc.getBean("studentSeven", Student.class); //为map类型属性赋值：map标签 + value/ref标签
      student = ioc.getBean("studentEight", Student.class); //p:命名空间
      System.out.println(student);
//      Clazz clazz = ioc.getBean("clazzTwo", Clazz.class); //为list类型属性赋值： list/set标签 + value/ref标签
//      System.out.println(clazz);

   }

}
