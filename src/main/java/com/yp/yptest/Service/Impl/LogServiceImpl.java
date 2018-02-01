package com.yp.yptest.Service.Impl;

import com.yp.yptest.Service.LogService;

public class LogServiceImpl implements LogService {

    @Override
    public void log(String msg) {
        System.out.println("i am logging data" + msg);
    }
}
