package com.yp.yptest.module;

import com.google.inject.AbstractModule;
import com.yp.yptest.Service.ApplicationService;
import com.yp.yptest.Service.Impl.AppImpl;
import com.yp.yptest.Service.Impl.LogServiceImpl;
import com.yp.yptest.Service.Impl.UserServiceImpl;
import com.yp.yptest.Service.LogService;
import com.yp.yptest.Service.UserService;

public class MyAppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(ApplicationService.class).to(AppImpl.class);
    }
}
