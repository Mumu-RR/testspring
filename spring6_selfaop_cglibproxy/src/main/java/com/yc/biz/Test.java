package com.yc.biz;

import com.yc.LogAspectCglib;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-11 19:49
 */
public class Test {
    public static void main(String[] args) {
        StudentBizImpl sbi=new StudentBizImpl();
        LogAspectCglib lc=new LogAspectCglib(sbi);

        //生成代理
        Object obj=lc.createProxy();
        System.out.println(obj);//obj.toString()
        if (obj instanceof StudentBizImpl){
            StudentBizImpl s=(StudentBizImpl)obj;
            s.find("张三");
            s.update("李四");
            s.add("王五");
        }
    }
}
