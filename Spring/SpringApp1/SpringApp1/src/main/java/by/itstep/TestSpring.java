package main.java.by.itstep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TestBean1 testBean = context.getBean("testBean", TestBean1.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
