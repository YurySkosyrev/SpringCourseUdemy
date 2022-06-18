package spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("spring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(Pet pet){
        return new Person(catBean());
    }
}
