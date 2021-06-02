package com.atguigu.srb.sms;

import com.atguigu.srb.sms.util.SmsProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)//创建spring上下文环境
public class UtilsTest {
    @Test
    public void testProperties() {
        System.out.println(SmsProperties.KEY_ID);
    }
}
