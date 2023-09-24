package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
    @Pointcut("execution (* com.luv2code.aopdemo.dao.*.*(..)) ")
    public void forDaoPackage() {}

    // Pointcut for getters
    @Pointcut("execution (* com.luv2code.aopdemo.dao.*.get*(..)) ")
    public void getter() {}

    // Pointcut for setters
    @Pointcut("execution (* com.luv2code.aopdemo.dao.*.set*(..)) ")
    public void setter() {}

    // Pointcut to includes all packages except getters and setters
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
