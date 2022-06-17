package spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

       Person person = context.getBean("personBean", Person.class);
       person.callYourPet();

        context.close();
    }
}
