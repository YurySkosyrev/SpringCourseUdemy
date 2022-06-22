package spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


    @Around("execution(* returnBook())")
    public Object afterGetStudentsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("В библиотеку пытаются вернуть книгу");

        Long start = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();

        System.out.println("Метод отработал за " + (end-start) + " миллисекунд");

        System.out.println("В библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
