package com.yc.springboot.helloworld.controller;


import com.yc.springboot.helloworld.properties.YcProperties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-24 10:40
 */
@Configuration
@RestController
public class HelloWorldController {
    //创建日志对象
    private static Log log= LogFactory.getLog(HelloWorldController.class);

    @Autowired
    private Environment env;

    @Value("${yc.tname}")
    private String tname;

    @Autowired
    private YcProperties yp;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "World")String name){
        log.debug("********debug*******");
        log.info("*********info*********");
        log.error("*********error********");
        log.fatal("**********fatal********");

        log.info("系统环境变量信息："+env);
        log.info("用户路径:"+env.getProperty("user.home"));

        log.info(""+env.getProperty("JAVA_HOME"));

        log.info("yc.tname:"+name);

        log.info("ycProperties中的属性"+yp.getTname()+"\t"+yp.getAge());
        log.info("env中是否也能拿到?"+env.getProperty("yc.tname")+"\t"+env.getProperty("yc.age"));



        //@RequestParam请求的参数name
        return String.format("Hello %s!",name);
    }
}
