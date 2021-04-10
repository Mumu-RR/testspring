package com.yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-09 20:15
 */
@Aspect //切面类   需要增强的功能写到这里
@Component //IOC注解  以实现spring托管的功能
@Order(value = 100)
public class LogAspect {

    @Around("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("************compute1进到   增强了...");
        long start=System.currentTimeMillis();
        Object retVal=pjp.proceed();
        long end=System.currentTimeMillis();
        System.out.println("compute1要增强了...");
        System.out.println("*****************这个方法运行的时长："+(end-start));
        return retVal;
    }

    //切入点的声明
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.add*(..))")
    private void add(){

    }

    @Pointcut("execution(* com.yc.biz.StudentBizImpl.update*(..))")
    private void update(){

    }

    @Pointcut("add() ||update()")
    private void addAndUpdate(){

    }


    //切入点表达式的语法:?代表出现0次或一次
    //modifiers-pattern:修饰
    //ret-type-pattern:返回类型
    //name-pattern:名字模型



    //增加的声明
    @Before("com.yc.aspect.LogAspect.add()")
    public void log(){
        System.out.println("==========前置增强的日志========");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dstr=sdf.format(d);
        System.out.println("执行时间："+dstr);
        System.out.println("============前置增强的日志结束===========");
    }
}
