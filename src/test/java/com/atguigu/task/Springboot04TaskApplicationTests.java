package com.atguigu.task;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot04TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {

        SimpleMailMessage message = new SimpleMailMessage();

        //邮件设置
        message.setFrom("527033269@qq.com");

        //设置标题
        message.setSubject("通知-今晚开会");

        //设置内容
        message.setText("今晚7：30开会");

        message.setTo("527033269@qq.com");


        javaMailSender.send(message);
    }

    @Test
    public void test() throws Exception{
        //创建一个复杂的消息邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        helper.setFrom("527033269@qq.com");

        //邮件设置
        helper.setSubject("通知-今晚开会");

        //设置内容
        helper.setText("<b style='color:read'>今晚7：30开会</b>",true);

        helper.setTo("527033269@qq.com");

        //上传文件
        helper.addAttachment("a.jpg",new File("D:\\Photoshop\\a.jpg"));

        javaMailSender.send(mimeMessage);
    }

}
