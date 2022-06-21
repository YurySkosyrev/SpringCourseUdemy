package spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring.aop.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("spring.aop.aspect.MyPointcats.addAllMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj:arguments){
                if(obj instanceof Book){
                    Book book = (Book)obj;
                    System.out.println("Информация о книге: название - " +
                            book.getName() + ", автор книги - " +
                            book.getAuthor() + ", год издания - " + book.getYearOfPublication());

                } else {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: логирование " +
                "попытки получить книгу/журнал");
        System.out.println("_________________________________________");
    }

//      @Pointcut("execution(* spring.aop.UniLibrary.*(..))")
//      public void allMethodsFromUniLibrary(){};
//
//      @Pointcut("execution(* spring.aop.UniLibrary.returnMagazine())")
//      public void allReturnMagazineFromUniLibrary(){};
//
//      @Pointcut("allMethodsFromUniLibrary() && !allReturnMagazineFromUniLibrary()")
//      public void allMethodsExceptFromUniLibrary(){};
//
//      @Before("allMethodsExceptFromUniLibrary()")
//      public void beforeAllMethodsExceptReturnMagazineAdvice(){
//            System.out.println("beforeGetLoggingAdvice: writing Log #10");
//      }

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





//
//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
