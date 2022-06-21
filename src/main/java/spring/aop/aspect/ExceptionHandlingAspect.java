package spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("spring.aop.aspect.MyPointcats.addAllMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("beforeAddExceptionHandlingAdvice: ловим/обрабатываем  " +
                "исключения при попытке получить книгу/журнал");
        System.out.println("_________________________________________");

    }
}
