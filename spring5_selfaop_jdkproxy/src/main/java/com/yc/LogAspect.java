package com.yc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

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

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

//    public Object createProxy(){
//        //新建一个代理实例
//        //return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target)
//    }
}
