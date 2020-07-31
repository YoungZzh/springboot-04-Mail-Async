package com.atguigu.task.service;

import org.springframework.stereotype.Service;

/**
 * Author:Young
 * Date:2020/7/21-22:21
 */
@Service
public class ScheduledService {
    /**
     * second（秒），minute（分），hour（时），day of month（日），month（月）day of week（周几）
     * 0 * * * * MON-FRI 表示在星期一到星期五整秒运行
     */
    //@Scheduled(cron = "* * * * * MON-SAT")
    public void hello(){
        System.out.println("hello.........");
    }
}
