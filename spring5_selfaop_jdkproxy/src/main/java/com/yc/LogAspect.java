package com.yc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-10 20:16
 */
public class LogAspect implements InvocationHandler {
    private Object target;//目标类的对象

    public LogAspect(Object target){
        this.target=target;
    }

    @Override //回调方法  当jvm调用代理对象的被代理方法时，会由jvm自动调用这个invoke
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类的对象:"+proxy.getClass());
        System.out.println("目标类的方法:"+method);
        System.out.println("方法中的参数:"+args);
        //转换成切入点表达式的解析_>AspectJ的切入点表达式
        if(method.getName().startsWith("add")) {
            //前置增强
            log();
        }
        //相当于直接执行了studentBizImpl中的find();
        Object returnValue=method.invoke(this.target,args);
        //后置增强

        return returnValue;
    }


    private void log(){
        System.out.println("==============before  advice============");
        System.out.println("hello world is"+new Date());
        System.out.println("========================================");
    }

    public Object createProxy(){
        //新建一个代理实例
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }
}
