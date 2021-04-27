package com.yc.springboot.helloworld.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-24 10:55
 */
@ConfigurationProperties(prefix = "yc")
public class YcProperties {
    private String tname;
    private int age;

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
