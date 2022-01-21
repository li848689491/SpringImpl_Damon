package com.damon.springimpl.context;

import com.damon.springimpl.beans.factory.HierarchicalBeanFactory;
import com.damon.springimpl.beans.factory.ListableBeanFactory;
import com.damon.springimpl.core.io.ResourceLoader;

/**
 * ApplicationContext，继承于 ListableBeanFactory，也就继承了关于 BeanFactory 方法，比如一些 getBean 的方法。
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}

