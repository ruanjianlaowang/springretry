package com.laowang.springretry.service;

public interface RetryService {
    int retryTest(int code) throws Exception;
}
