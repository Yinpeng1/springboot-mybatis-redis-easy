package com.yp.yptest.Service.Impl;

import com.google.inject.Inject;
import com.yp.yptest.Service.ApplicationService;
import com.yp.yptest.Service.LogService;
import com.yp.yptest.Service.UserService;

public class AppImpl implements ApplicationService {
    @Inject
    private UserService userService;
    @Inject
    private LogService logService;

//    @Inject
//    public AppImpl(UserService userService, LogService logService){
//        this.userService = userService;
//        this.logService = logService;
//    }

    @Override
    public void work() {
        userService.process();
        logService.log("程序正常运行");
    }
}
