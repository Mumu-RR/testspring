package com.yc.biz;

import com.yc.MyAppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: testspring
 * @description:
 * @author: 作者
 * @create: 2021-04-11 19:16
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyAppConfig.class)
public class StudentBizImplTest{

    @Autowired
    //@Resource(name = "studentBizImpl")
    private StudentBiz sbi;

    @Test
    public void testAdd(){
        sbi.add("张三");
    }

    @Test
    public void testUpdate(){
        sbi.update("张三");
    }

    @Test
    public void testFind(){
        sbi.find("张三");
    }
}