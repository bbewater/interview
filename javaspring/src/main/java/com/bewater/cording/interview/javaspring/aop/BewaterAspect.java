package com.bewater.cording.interview.javaspring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 15:23 2022/5/12
 */
@Component
@Aspect
@EnableAspectJAutoProxy //这个注解别忘了
public class BewaterAspect {

    @Before("execution(public void com.bewater.cording.interview.javaspring.aop.AopB.testAop())")
    public void before(){
        System.out.println("正在执行aop逻辑");
    }


    @After("execution(public void com.bewater.cording.interview.javaspring.aop.AopB.testAop())")
    public void after(){
        System.out.println("aop逻辑执行完成");
    }

}
