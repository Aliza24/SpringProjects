package com.jecrc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Used to test aware interface
@Component("userService")
public class UserService implements BeanNameAware, ApplicationContextAware {

    //Default constructor is called
    public UserService()
    {
        System.out.println("User Service Constructor Called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Name is: " + applicationContext.getClass());
    }

}
