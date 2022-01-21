package com.damon.springimpl.context;

import com.damon.springimpl.beans.BeansException;
import com.damon.springimpl.beans.factory.Aware;

public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
