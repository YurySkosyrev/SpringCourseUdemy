package spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

      @Pointcut("execution(* spring.aop.UniLibrary.*(..))")
      public void allMethodsFromUniLibrary(){};

      @Pointcut("execution(* spring.aop.UniLibrary.returnMagazine())")
      public void allReturnMagazineFromUniLibrary(){};

      @Pointcut("allMethodsFromUniLibrary() && !allReturnMagazineFromUniLibrary()")
      public void allMethodsExceptFromUniLibrary(){};

      @Before("allMethodsExceptFromUniLibrary()")
      public void beforeAllMethodsExceptReturnMagazineAdvice(){
            System.out.println("beforeGetLoggingAdvice: writing Log #10");
      }

//      @Pointcut("execution(* spring.aop.UniLibrary.get*())")
//      public void allGetMethodsFromUnilibrary(){};
//
//      @Pointcut("execution(* spring.aop.UniLibrary.return*())")
//      public void allReturnMethodsFromUnilibrary(){};
//
//      @Pointcut("allGetMethodsFromUnilibrary() || allReturnMethodsFromUnilibrary()")
//      public void allGetAndReturnMethodsFromUnilibrary(){};
//
//
//      @Before("allGetMethodsFromUnilibrary()")
//      public void beforeGetLoggingAdvice(){
//            System.out.println("beforeGetLoggingAdvice: writing Log #1");
//      }
//
//      @Before("allReturnMethodsFromUnilibrary()")
//      public void beforeReturnLoggingAdvice(){
//            System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//      }
//
//      @Before("allGetAndReturnMethodsFromUnilibrary()")
//      public void beforeGetAndReturnLoggingAdvice(){
//            System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//      }
//    @Pointcut("execution(void get*())")
//    private void getAllMethods(){};
//
//    @Before("getAllMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу");
//    }
//
//    @Before("getAllMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeSecurityBookAdvice: проверка прав на получение");
//    }
//
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
