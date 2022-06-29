package spring.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import spring.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice логгируем получение " +
//                "списка студентов перед методом GetStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//
//        Student FirstStudent = students.get(0);
//
//        String name = FirstStudent.getNameSurname();
//        FirstStudent.setNameSurname("Mr " + name);
//
//        double avgGrade = FirstStudent.getAvgGrade();
//        FirstStudent.setAvgGrade(avgGrade + 1);
//
//
//
//
//        System.out.println("afterGetStudentsLoggingAdvice логгируем получение " +
//                "списка студентов после метода GetStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
//                "логгируем выброс исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice(){
        System.out.println("afterGetStudentsAdvice: " +
                "логгируем нормальное завершение метода" +
                ", либо выброс исключения");
    }

}
