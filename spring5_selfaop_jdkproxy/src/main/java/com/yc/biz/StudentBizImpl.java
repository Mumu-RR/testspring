package com.yc.biz;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-10 20:07
 */
public class StudentBizImpl  implements StudentBiz{

    @Override
    public int add(String name) {
        System.out.println("调用了studentBizImpl中的add"+name);
        return 100;
    }

    @Override
    public void update(String name) {
        System.out.println("调用了studentBizImpl中的update"+name);
    }

    @Override
    public String find(String name) {
        System.out.println("调用了studentBizImpl中的find"+name);
        return name+"=====";
    }
}
