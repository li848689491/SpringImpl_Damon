package com.damon.springimpl.beans.factory.support;

import com.damon.springimpl.beans.BeansException;
import com.damon.springimpl.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
