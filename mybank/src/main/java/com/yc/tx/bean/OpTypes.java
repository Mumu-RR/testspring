package com.yc.tx.bean;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-17 15:09
 */
//枚举类型
public enum OpTypes {
    deposite("deposite",1),withdraw("withdraw",2),transfer("transfer",3);

    //枚举对象中的成员变量
    private String name;
    private int index;

    //构造方法
    private OpTypes(String name,int index){
        this.name=name;
        this.index=index;
    }

    //覆盖方法
    @Override
    public String toString(){
        return this.index+"_"+this.name;
    }

    public String getName(){
        return this.name;
    }
}
