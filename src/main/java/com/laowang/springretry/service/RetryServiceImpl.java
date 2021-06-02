/**
 * @description: TODO
 * @author Administrator
 * @date 2021/6/2 12:23
 * @version 1.0
 */
package com.laowang.springretry.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class RetryServiceImpl implements RetryService {

    @Override
    @Retryable(value = Exception.class, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 1.5))
    public int retryTest(int code) throws Exception {
        System.out.println("retryTest被调用,时间：" + LocalTime.now());
        if (code == 0) {
            throw new Exception("异常抛出！");
        }
        System.out.println("retryTest被调用,情况对头了！");

        return 200;
    }

    @Recover
    public int recover(Exception e) {
        System.out.println("回调方法执行，可以记录日志到数据库！！！！");
        //记日志到数据库 或者调用其余的方法
        return 400;
    }
}
