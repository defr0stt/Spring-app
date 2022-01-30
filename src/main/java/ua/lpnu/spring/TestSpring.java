package ua.lpnu.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring
{
    public static void main(String[] args) {

        // name of configure file in constructor
        // important to create .xml file in resource package
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // process of getting created bean what was
        // created in .xml file
        // 2-nd arg it's the name of the class what
        // we wanted to get
        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println("\nGetting name from the 1-st bean : " + testBean.getName());

        // important to close context and it
        // destroys all created beans
        context.close();
    }
}
