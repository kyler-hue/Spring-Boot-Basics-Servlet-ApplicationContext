package com.example.demo.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AwareBean implements
        BeanNameAware,
        ApplicationContextAware,
        EnvironmentAware,
        ApplicationEventPublisherAware {

    public AwareBean() {
        System.out.println("AwareBean constructor called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("2. BeanNameAware: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) {
        System.out.println("3. ApplicationContextAware");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("Environment active profiles: "
                + Arrays.toString(environment.getActiveProfiles()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        System.out.println("ApplicationEventPublisherAware");
    }
}

