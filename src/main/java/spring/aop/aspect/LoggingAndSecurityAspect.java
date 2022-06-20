package spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(void get*())")
    private void getAllMethods(){};

    @Before("getAllMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу");
    }

    @Before("getAllMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeSecurityBookAdvice: проверка прав на получение");
    }

    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
}
