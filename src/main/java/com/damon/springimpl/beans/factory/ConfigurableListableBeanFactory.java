package com.damon.springimpl.beans.factory;

import com.damon.springimpl.beans.BeansException;
import com.damon.springimpl.beans.factory.config.AutowireCapableBeanFactory;
import com.damon.springimpl.beans.factory.config.BeanDefinition;
import com.damon.springimpl.beans.factory.config.BeanPostProcessor;
import com.damon.springimpl.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
