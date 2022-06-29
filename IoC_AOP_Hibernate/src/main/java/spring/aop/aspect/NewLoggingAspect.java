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

        Object targetMethodResult = null;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception ex){
            System.out.println(ex);
            throw ex;
        }

        System.out.println("В библиотеку успешно вернули книгу");

        return targetMethodResult;
    }
}
