package com.yc;

import com.yc.biz.StudentBiz;
import com.yc.biz.StudentBizImpl;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-11 18:57
 */
public class Test {
    public static void main(String[] args){
        StudentBiz target=new StudentBizImpl();//spring进行IOc

        LogAspect la=new LogAspect(target);

        Object obj=la.createProxy();//obj就是代理对象
        //System.out.println(obj);

        if(obj instanceof StudentBiz){
            StudentBiz sb=(StudentBiz)obj;
            sb.find("张三");//jvm会自动感到sb是一个proxy，jvm就会调用这个proxy中的invoke

            sb.add("李四");

            sb.update("王无");
        }
    }
}
