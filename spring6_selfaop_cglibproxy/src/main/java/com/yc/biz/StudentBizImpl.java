package com.yc.biz;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-11 19:41
 */
public class StudentBizImpl {

    public int add(String name) {
        System.out.println("调用了studentBizImpl中的add"+name);
        return 100;
    }


    public void update(String name) {
        System.out.println("调用了studentBizImpl中的update"+name);
    }


    public String find(String name) {
        System.out.println("调用了studentBizImpl中的find"+name);
        return name+"=====";
    }
}
