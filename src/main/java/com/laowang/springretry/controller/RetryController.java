/**
 * @description: TODO
 * @author Administrator
 * @date 2021/6/2 14:55
 * @version 1.0
 */
package com.laowang.springretry.controller;

import com.laowang.springretry.service.RetryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api("重试测试类")
@RestController
public class RetryController {
    @Autowired
    RetryService retryService;

    @GetMapping("/testRetry")
    public String testRetry(int code) throws Exception {
        int result = retryService.retryTest(code);
        return "result：" + result;
    }
}
