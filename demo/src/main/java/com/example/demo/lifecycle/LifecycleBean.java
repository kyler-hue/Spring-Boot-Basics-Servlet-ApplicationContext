package com.example.demo.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean implements InitializingBean, DisposableBean {

    public LifecycleBean() {
        System.out.println("1. LifecycleBean Constructor called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("4. @PostConstruct called");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("5. afterPropertiesSet()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("7. @PreDestroy called");
    }

    @Override
    public void destroy() {
        System.out.println("8. DisposableBean.destroy()");
    }
}

