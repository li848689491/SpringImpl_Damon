package com.damon.springimpl.beans.factory;

import com.damon.springimpl.beans.BeansException;

public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}

