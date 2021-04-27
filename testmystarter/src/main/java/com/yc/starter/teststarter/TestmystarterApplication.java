package com.yc.starter.teststarter;


import com.yc.starter.hellostarter.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-22 20:03
 */
@SpringBootApplication
@RestController
public class TestmystarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmystarterApplication.class,args);
    }


    @Autowired
    private IHelloService helloService;


    @GetMapping("/hello")
    public String sayHello(){
        return helloService.say();
    }
}
