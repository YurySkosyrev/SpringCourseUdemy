package spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcats {
    @Pointcut("execution(void abc*(..))")
    public void addAllMethods(){};
}
